package org.gdou.busstation.service;

import org.gdou.busstation.dto.*;

public interface ScheduleService {

    GetScheduleResponseDto getSchedule(GetScheduleRequestDto requestDto);

    CommonResponseDto saveSchedule(SaveScheduleRequestDto requestDto);
}
