package org.gdou.busstation.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.service.ListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ListController {

    private static final Logger logger = LoggerFactory.getLogger(ListController.class);

    @Autowired
    ListService listService;

    @GetMapping(path = "/list")
    GetListResponseDto getList(GetListRequestDto requestDto){
        GetListResponseDto list = listService.getList(requestDto);
        return list;
    }

    @PostMapping(path = "/saveList")
    CommonResponseDto saveList(SaveListRequestDto requestDto){
        CommonResponseDto responseDto = listService.saveList(requestDto);
        return responseDto;
    }

    @PostMapping(path = "/saveListV2",produces = "application/json;charset=utf-8")
    CommonResponseDto saveListV2(SaveListV2RequestDto requestDto){
        CommonResponseDto responseDto = listService.saveListV2(requestDto);
        return responseDto;
    }
}
