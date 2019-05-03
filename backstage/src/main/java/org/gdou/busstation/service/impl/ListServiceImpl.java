package org.gdou.busstation.service.impl;

import org.assertj.core.util.Lists;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.Util.ObjectUtils;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.exception.ServiceException;
import org.gdou.busstation.mapper.ListMapper;
import org.gdou.busstation.model.List;
import org.gdou.busstation.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ListServiceImpl implements ListService {

    @Autowired
    ListMapper listMapper;

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
                //todo copy大法
                ObjectUtils.copy(list,dto);
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
            list.setArriveTime(requestDto.getArriveTime());
            list.setDistance(requestDto.getDistance());
            list.setFirstStation(requestDto.getFirstStation());
            list.setLastStation(requestDto.getLastStation());
            list.setLeaveTime(requestDto.getLeaveTime());
            list.setPrice(requestDto.getPrice());
            list.setStatus(requestDto.getStatus());
            list.setVia(requestDto.getVia());
            listMapper.updateByPrimaryKey(list);
        }
        return new CommonResponseDto().code(0).success(true);
    }
}
