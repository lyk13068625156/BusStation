package org.gdou.busstation.controller;

import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetScheduleRequestDto;
import org.gdou.busstation.dto.GetScheduleResponseDto;
import org.gdou.busstation.dto.SaveScheduleRequestDto;
import org.gdou.busstation.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @PostMapping(path = "/schedule")
    GetScheduleResponseDto getSchedule(GetScheduleRequestDto requestDto){
        GetScheduleResponseDto schedule = scheduleService.getSchedule(requestDto);
        return schedule;
    }

    @PostMapping(path = "/saveSchedule")
    CommonResponseDto saveSchedule(SaveScheduleRequestDto requestDto){
        CommonResponseDto responseDto = scheduleService.saveSchedule(requestDto);
        return responseDto;
    }
}
