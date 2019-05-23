package org.gdou.busstation.controller;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetStationRequestDto;
import org.gdou.busstation.dto.GetStationResponseDto;
import org.gdou.busstation.dto.SaveStationRequestDto;
import org.gdou.busstation.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationController {

    @Autowired
    StationService stationService;

    @GetMapping(path = "/station")
    GetStationResponseDto getStation(GetStationRequestDto requestDto){
        System.out.println(requestDto.toString());
        GetStationResponseDto station = stationService.getStation(requestDto);
        return station;
    }

    @PostMapping(path = "/saveStation")
    CommonResponseDto saveStation(SaveStationRequestDto requestDto){
        System.out.println(requestDto.toString());
        CommonResponseDto responseDto = stationService.saveStation(requestDto);
        return responseDto;
    }
}
