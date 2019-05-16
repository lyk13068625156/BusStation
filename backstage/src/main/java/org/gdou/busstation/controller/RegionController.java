package org.gdou.busstation.controller;

import org.gdou.busstation.dto.GetRegionRequestDto;
import org.gdou.busstation.dto.GetRegionResponseDto;
import org.gdou.busstation.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController {

    @Autowired
    RegionService regionService;

    @GetMapping(path = "/getRegion/{parentId}")
    GetRegionResponseDto getRegion(@PathVariable("parentId") Integer parentId){
        GetRegionRequestDto requestDto = new GetRegionRequestDto();
        requestDto.setParentId(parentId);
        GetRegionResponseDto region = regionService.getRegion(requestDto);
        return region;
    }
}
