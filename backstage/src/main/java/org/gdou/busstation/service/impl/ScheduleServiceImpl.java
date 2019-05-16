package org.gdou.busstation.service.impl;

import com.sun.deploy.security.MSCryptoDSASignature;
import org.assertj.core.util.CheckReturnValue;
import org.assertj.core.util.Lists;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.Util.ObjectUtils;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.exception.ServiceException;
import org.gdou.busstation.mapper.ScheduleMapper;
import org.gdou.busstation.model.Schedule;
import org.gdou.busstation.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public GetScheduleResponseDto getSchedule(GetScheduleRequestDto requestDto) {
        GetScheduleResponseDto responseDto = new GetScheduleResponseDto();
        GetScheduleResponseResultDto resultDto = new GetScheduleResponseResultDto();
        List<Schedule> schedules = scheduleMapper.getSchedule(requestDto);
        Integer total = scheduleMapper.getScheduleCount(requestDto);
        List<ScheduleDetailDto> items = Lists.newArrayList();
        if (!schedules.isEmpty()){
            for (Schedule schedule : schedules) {
                ScheduleDetailDto dto = new ScheduleDetailDto();
                ObjectUtils.copy(schedule,dto);
                items.add(dto);
            }
        }
        resultDto.total(total).items(items);
        responseDto.code(0).success(true).result(resultDto);
        return responseDto;
    }

    @Override
    public CommonResponseDto saveSchedule(SaveScheduleRequestDto requestDto) {
        Integer id = requestDto.getId();
        if (id == null){    //  新增
            Schedule schedule = new Schedule();
            ObjectUtils.copy(requestDto,schedule);
            schedule.setCreateTime(new Date());
        }else {
            Schedule schedule = scheduleMapper.selectByPrimaryKey(id);
            if (schedule == null) {
                throw new ServiceException(BusStationContants.SYS_NOT_FOUND,"找不到改班次");
            }
            schedule.setLeaveTime(requestDto.getLeaveTime());
            schedule.setPrice(requestDto.getPrice());
            schedule.setStatus(requestDto.getStatus());
            schedule.setUpdateTime(new Date());
            //  TODO 其他信息是否支持修改
            scheduleMapper.updateByPrimaryKeySelective(schedule);
        }
        return new CommonResponseDto().code(0).success(true);
    }
}
