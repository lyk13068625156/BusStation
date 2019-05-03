package org.gdou.busstation.service.impl;

import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetScheduleRequestDto;
import org.gdou.busstation.dto.GetScheduleResponseDto;
import org.gdou.busstation.dto.SaveScheduleRequestDto;
import org.gdou.busstation.mapper.ScheduleMapper;
import org.gdou.busstation.model.Schedule;
import org.gdou.busstation.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public GetScheduleResponseDto getSchedule(GetScheduleRequestDto requestDto) {
        List<Schedule> schedules = scheduleMapper.getSchedule(requestDto);
        Integer total = scheduleMapper.getScheduleCount(requestDto);
        return null;
    }

    @Override
    public CommonResponseDto saveSchedule(SaveScheduleRequestDto requestDto) {
        return null;
    }
}
