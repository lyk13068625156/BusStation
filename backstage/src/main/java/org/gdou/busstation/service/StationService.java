package org.gdou.busstation.service;

import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetStationRequestDto;
import org.gdou.busstation.dto.GetStationResponseDto;
import org.gdou.busstation.dto.SaveStationRequestDto;

public interface StationService {

    GetStationResponseDto getStation(GetStationRequestDto requestDto);

    CommonResponseDto saveStation(SaveStationRequestDto requestDto);
}
