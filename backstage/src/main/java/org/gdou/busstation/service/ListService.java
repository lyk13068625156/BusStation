package org.gdou.busstation.service;

import org.gdou.busstation.dto.*;

public interface ListService {

    GetListResponseDto getList(GetListRequestDto requestDto);

    CommonResponseDto saveList(SaveListRequestDto requestDto);

    CommonResponseDto saveListV2(SaveListV2RequestDto requestDto);
}
