package org.gdou.busstation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.gdou.busstation.dto.GetStationRequestDto;
import org.gdou.busstation.mapper.provide.StationProvider;
import org.gdou.busstation.model.Station;
import org.gdou.busstation.tkMybatis.BaseMapper;

import java.util.List;

@Mapper
public interface StationMapper extends BaseMapper<Station> {

    @SelectProvider(type = StationProvider.class, method = "getStation")
    List<Station> getStation(GetStationRequestDto requestDto);

    @SelectProvider(type = StationProvider.class, method = "getStationCount")
    Integer getStationCount(GetStationRequestDto requestDto);
}
