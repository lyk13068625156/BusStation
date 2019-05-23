package org.gdou.busstation.service.impl;

import com.sun.javafx.binding.StringFormatter;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.Util.ObjectUtils;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.exception.ServiceException;
import org.gdou.busstation.mapper.StationMapper;
import org.gdou.busstation.model.Region;
import org.gdou.busstation.model.Station;
import org.gdou.busstation.service.RegionService;
import org.gdou.busstation.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    StationMapper stationMapper;
    @Autowired
    RegionService regionService;

    @Override
    public GetStationResponseDto getStation(GetStationRequestDto requestDto) {
        List<Station> stations = stationMapper.getStation(requestDto);
        Integer total = stationMapper.getStationCount(requestDto);
        GetStationResponseDto responseDto = new GetStationResponseDto();
        GetStationResponseResultDto resultDto = new GetStationResponseResultDto();
        resultDto.setTotal(total);
        List<StationDetailDto> items = Lists.newArrayList();
        if (!stations.isEmpty()){
            for (Station station : stations) {
                StationDetailDto detailDto = new StationDetailDto();
                //  TODO：copy方法偷懒大法
                ObjectUtils.copy(station,detailDto);
                detailDto.setProvince(regionService.getRegionById(station.getProvinceId()));
                detailDto.setCity(regionService.getRegionById(station.getCityId()));
                detailDto.setSection(regionService.getRegionById(station.getSectionId()));
                items.add(detailDto);
            }
        }
        resultDto.setItems(items);
        return responseDto.code(0).success(true).result(resultDto);
    }

    @Override
    public CommonResponseDto saveStation(SaveStationRequestDto requestDto) {
        if (requestDto.getId() == null){    //新建
            Station station = new Station();
            station.setName(requestDto.getName());
            station.setProvinceId(requestDto.getProvince());
            station.setCityId(requestDto.getCity());
            station.setSectionId(requestDto.getSection());
            station.setStatus(requestDto.getStatus());
            station.setAddress(requestDto.getAddress());
            station.setCreateTime(new Date());
            int i = stationMapper.insertSelective(station);
            if (i == 1){
                return new CommonResponseDto().code(0).success(true).message("新增成功");
            }else
                return new CommonResponseDto().code(1).success(false).message("新增失败");
        }else{
            Station station = stationMapper.selectByPrimaryKey(requestDto.getId());
            if (station == null){
                throw new ServiceException(BusStationContants.SYS_NOT_FOUND, String.format("找不到id=%d的车站信息", requestDto.getId()));
            }
            station.setName(requestDto.getName());
            station.setProvinceId(requestDto.getProvince());
            station.setCityId(requestDto.getCity());
            station.setSectionId(requestDto.getSection());
            station.setAddress(requestDto.getAddress());
            station.setStatus(requestDto.getStatus());
            station.setUpdateTime(new Date());
            stationMapper.updateByPrimaryKeySelective(station);
            return new CommonResponseDto().code(0).success(true).message("更新成功");
        }
    }
}
