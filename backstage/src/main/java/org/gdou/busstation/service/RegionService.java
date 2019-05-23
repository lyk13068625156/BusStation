package org.gdou.busstation.service;

import org.gdou.busstation.dto.GetRegionRequestDto;
import org.gdou.busstation.dto.GetRegionResponseDto;
import org.gdou.busstation.dto.SetRegionResponseDto;
import org.gdou.busstation.model.Region;

public interface RegionService {

    GetRegionResponseDto getRegion(GetRegionRequestDto requestDto);

    String getRegionById(Integer id);

    SetRegionResponseDto setRegion(Integer regionId);
}
