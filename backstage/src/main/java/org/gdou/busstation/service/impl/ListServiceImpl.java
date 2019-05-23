package org.gdou.busstation.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.assertj.core.util.Lists;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.Util.ObjectUtils;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.exception.ServiceException;
import org.gdou.busstation.mapper.ListMapper;
import org.gdou.busstation.mapper.ScheduleMapper;
import org.gdou.busstation.mapper.StationMapper;
import org.gdou.busstation.model.List;
import org.gdou.busstation.model.Schedule;
import org.gdou.busstation.model.Station;
import org.gdou.busstation.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.print.attribute.standard.SheetCollate;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

@Service
public class ListServiceImpl implements ListService {

    @Autowired
    ListMapper listMapper;

    @Autowired
    StationMapper stationMapper;

    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public GetListResponseDto getList(GetListRequestDto requestDto) {
        java.util.List<List> lists = listMapper.getList(requestDto);
        Integer total = listMapper.getListCount(requestDto);
        GetListResponseDto responseDto = new GetListResponseDto();
        GetListResponseResultDto resultDto = new GetListResponseResultDto();
        java.util.List<ListDetailDto> items = Lists.newArrayList();
        if (!lists.isEmpty()){
            for (List list : lists) {
                ListDetailDto dto = new ListDetailDto();
                java.util.List<String> viaName = new ArrayList<>();
                java.util.List<Integer> viaId = new ArrayList<>();
                JSONArray objects = JSONObject.parseArray(list.getVia());
                int size = objects.size();
                for (int i = 0; i < size; i++) {
                    JSONObject object = JSONObject.parseObject(objects.get(i).toString());
                    Integer id = object.getInteger("id");
                    Station station = stationMapper.selectByPrimaryKey(id);
                    viaName.add(station == null ? "" : station.getName());
                    viaId.add(id);
                }
                ObjectUtils.copy(list,dto);
                dto.setViaName(viaName);
                dto.setViaId(viaId);
                dto.setVia(viaName.toString());
                dto.setCreateTime(list.getCreateTime() == null ? "" : list.getCreateTime().toString());
                items.add(dto);
            }
        }
        resultDto.setTotal(total);
        resultDto.setItems(items);
        responseDto.code(0).success(true).result(resultDto);
        return responseDto;
    }

    @Override
    public CommonResponseDto saveList(SaveListRequestDto requestDto) {
        Integer id = requestDto.getId();
        if (id == null){            //  新增
            List list = new List();
            //  TODO COPY偷懒大法
            ObjectUtils.copy(requestDto, list);
            list.setCreateTime(new Date());
            listMapper.insertSelective(list);
        }else{  //  更新
            List list = listMapper.selectByPrimaryKey(id);
            if (list == null){
                throw new ServiceException(BusStationContants.SYS_NOT_FOUND,"找不到本车次");
            }
            //  TODO 业务判断座位数、价格（已售的要不要退补）、状态改变是否有人买票了、站点信息等信息是否不可以修改，失败则抛异常信息
            //  TODO 或者只能当前未开售车次才能生效（或者独立去修改车次-车站-日期的信息）
            //  TODO 应该不允许修改站点信息，站点信息不同就应该新建车次
            list.setUpdateTime(new Date());
            list.setSeat(requestDto.getSeat());
            //list.setArriveTime(requestDto.getArriveTime());
            list.setDistance(requestDto.getDistance());
            list.setFirstStation(requestDto.getFirstStation());
            list.setLastStation(requestDto.getLastStation());
            //list.setLeaveTime(requestDto.getLeaveTime());
            list.setPrice(requestDto.getPrice());
            list.setStatus(requestDto.getStatus());
            list.setVia(requestDto.getVia());
            listMapper.updateByPrimaryKey(list);
        }
        return new CommonResponseDto().code(0).success(true);
    }

    @Transactional
    @Override
    public CommonResponseDto saveListV2(SaveListV2RequestDto requestDto) {
        Integer id = requestDto.getId();
        Integer seat = requestDto.getSeat();
        String name = requestDto.getName();
        Integer status = requestDto.getStatus();
        java.util.List<Integer> station = requestDto.getStation();
        java.util.List<Integer> distance = requestDto.getDistance();
        java.util.List<LocalTime> leaveTime = requestDto.getLeaveTime();
        java.util.List<Double> price = requestDto.getPrice();
        if (station.isEmpty() || distance.isEmpty() || leaveTime.isEmpty() || price.isEmpty() ||
                !(station.size() == distance.size() && distance.size() == leaveTime.size() &&
                        leaveTime.size()== price.size())){
            throw new ServiceException(BusStationContants.SYS_BAD_REQUEST,"参数不完整");
        }
        if (id == null){    //新增
            List list = new List();
            list.setName(name);
            list.setFirstStation(station.get(0));
            list.setLeaveTime(leaveTime.get(0));
            list.setLastStation(station.get(station.size()-1));
            list.setSeat(seat);
            list.setPrice(price.get(price.size()-1));
            list.setDistance(distance.get(distance.size()-1));
            list.setStatus(status);
            list.setCreateTime(new Date());
            int total = station.size();
            java.util.List<ListViaDto> viaDtoList = new LinkedList<>();
            for (int i = 0; i < total ; i++) {
                ListViaDto via = new ListViaDto();
                via.setId(station.get(i));
                via.setTime(leaveTime.get(i).toString());
                System.out.println(leaveTime.get(i).toString());
                via.setDistance(distance.get(i));
                via.setPrice(price.get(i));
                viaDtoList.add(via);
            }

            String viaStr = net.minidev.json.JSONArray.toJSONString(viaDtoList);
            list.setVia(viaStr);
            listMapper.insertSelective(list);

            Integer maxId = listMapper.getMaxId();
            for (int k = 0; k < total ; k++) {
                for (int m = 0; m < 7; m++){
                    LocalDate day = LocalDate.now();
                    day.plusDays(m);
                    Schedule schedule = new Schedule();
                    schedule.setListId(maxId);
                    schedule.setThisStationId(station.get(k));
                    schedule.setDay(day);
                    schedule.setLeaveTime(leaveTime.get(k));
                    schedule.setSeat(seat);
                    if (k <= total - 2){
                        Integer nextStation = station.get(k + 1);
                        schedule.setNextStationId(nextStation);
                    }else
                        schedule.setNextStationId(null);
                    schedule.setDistance(distance.get(k));
                    schedule.setPrice(price.get(k));
                    schedule.setStatus(status);
                    schedule.setCreateTime(new Date());
                    scheduleMapper.insert(schedule);
                }
            }
            return new CommonResponseDto().code(0).success(true).message("新增成功");
        }else {     //更新
            List list = listMapper.selectByPrimaryKey(id);
            if (list == null){
                throw new ServiceException(BusStationContants.SYS_NOT_FOUND,"参数不完整");
            }
            list.setName(name);
            list.setLeaveTime(leaveTime.get(0));
            list.setSeat(seat);
            list.setPrice(price.get(price.size()-1));
            list.setDistance(distance.get(distance.size()-1));
            list.setStatus(status);
            list.setCreateTime(new Date());
            int total = station.size();
            java.util.List<ListViaDto> viaDtoList = new LinkedList<>();
            for (int i = 0; i < total ; i++) {
                ListViaDto via = new ListViaDto();
                via.setId(station.get(i));
                via.setTime(leaveTime.get(i).toString());
                via.setDistance(distance.get(i));
                via.setPrice(price.get(i));
                viaDtoList.add(via);
            }
            JSONArray objects = new JSONArray(Collections.singletonList(viaDtoList));
            list.setVia(objects.toJSONString());
            list.setUpdateTime(new Date());
            int i = listMapper.updateByPrimaryKeySelective(list);
            if (i == 1){
                return new CommonResponseDto().code(0).success(true).message("修改成功");
            }else {
                throw new ServiceException(BusStationContants.SYS_BAD_REQUEST,"修改失败");
            }
        }
    }
}
