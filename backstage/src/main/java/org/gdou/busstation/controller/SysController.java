package org.gdou.busstation.controller;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.apache.ibatis.annotations.Param;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.mapper.UserMapper;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.SysService;
import org.gdou.busstation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.file.Path;

@RestController
public class SysController {

    @Autowired
    SysService sysService;

    @PostMapping(path = "register", produces="application/json;charset=utf-8")
    public CommonResponseDto register(RegisterInputDto request){
        CommonResponseDto response = sysService.register(request);
        return response;
    }

    @PostMapping(path = "login", produces="application/json;charset=utf-8")
    public CommonResponseDto login(LoginInputDto request, HttpServletResponse servletResponse){
        CommonResponseDto response = sysService.login(request);
        if (response.getCode() == 0){
            Cookie cookie = new Cookie("userName",request.getUserName());
            cookie.setPath("/");
            // 如果cookie的值中含有中文时，需要对cookie进行编码，不然会产生乱码
            try {
                URLEncoder.encode(request.getUserName(), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            cookie.setMaxAge(BusStationContants.TIME_HALF_OF_HOUR);
            cookie.setHttpOnly(false);
            servletResponse.addCookie(cookie);
        }
        return response;
    }

    @GetMapping(path = "logout/{userName}", produces="application/json;charset=utf-8")
    public CommonResponseDto logout(@PathVariable("userName") String userName,HttpSession session){
        session.removeAttribute(userName);
        return new CommonResponseDto().code(0).success(true).message("login.html");
    }

    @PostMapping(path = "reset", produces="application/json;charset=utf-8")
    public CommonResponseDto reset(ResetInputDto request){
        CommonResponseDto response = sysService.reset(request);
        return response;
    }

    @GetMapping(path = "/myInfo/{userName}",produces = "application/json;charset=utf-8")
    public GetMyInfoResponseDto getMyInfo(@PathVariable("userName") String userName){
        GetMyInfoRequestDto requestDto = new GetMyInfoRequestDto();
        requestDto.setUserName(userName);
        GetMyInfoResponseDto myInfo = sysService.getMyInfo(requestDto);
        return myInfo;
    }

    @PostMapping(path = "/updateMyInfo",produces = "application/json;charset=utf-8")
    public CommonResponseDto updateMyInfo(UpdateMyInfoInputDto inputDto){
        CommonResponseDto responseDto = sysService.updateMyInfo(inputDto);
        return responseDto;
    }
}