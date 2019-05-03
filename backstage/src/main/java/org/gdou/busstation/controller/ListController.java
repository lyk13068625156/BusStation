package org.gdou.busstation.controller;

import org.apache.ibatis.annotations.Param;
import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetListRequestDto;
import org.gdou.busstation.dto.GetListResponseDto;
import org.gdou.busstation.dto.SaveListRequestDto;
import org.gdou.busstation.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    @Autowired
    ListService listService;

    @PostMapping(path = "/list")
    GetListResponseDto getList(GetListRequestDto requestDto){
        GetListResponseDto list = listService.getList(requestDto);
        return list;
    }

    @PostMapping(path = "/saveList")
    CommonResponseDto saveList(SaveListRequestDto requestDto){
        CommonResponseDto responseDto = listService.saveList(requestDto);
        return responseDto;
    }
}
