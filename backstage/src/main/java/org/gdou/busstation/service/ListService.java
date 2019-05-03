package org.gdou.busstation.service;

import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetListRequestDto;
import org.gdou.busstation.dto.GetListResponseDto;
import org.gdou.busstation.dto.SaveListRequestDto;

public interface ListService {

    GetListResponseDto getList(GetListRequestDto requestDto);

    CommonResponseDto saveList(SaveListRequestDto requestDto);
}
