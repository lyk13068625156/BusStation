package org.gdou.busstation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.gdou.busstation.dto.GetScheduleRequestDto;
import org.gdou.busstation.mapper.provide.ScheduleProvider;
import org.gdou.busstation.model.Schedule;
import org.gdou.busstation.tkMybatis.BaseMapper;

import java.util.List;

@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule> {

    @SelectProvider(type = ScheduleProvider.class, method = "getSchedule")
    List<Schedule> getSchedule(GetScheduleRequestDto requestDto);

    @SelectProvider(type = ScheduleProvider.class, method = "getScheduleCount")
    Integer getScheduleCount(GetScheduleRequestDto requestDto);
}
