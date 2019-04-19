package org.gdou.busstation.controller;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.apache.ibatis.annotations.Param;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.dto.*;
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

@RestController
public class SysController extends BaseController {

    @Autowired
    SysService sysService;


    @PostMapping(path = "register", produces = "application/json;charset=utf-8")
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
        return new CommonResponseDto().code(2).success(true).message("login.html");
    }

    public CommonResponseDto reset(ResetRequestDto request){
        CommonResponseDto response = sysService.reset(request);
        return response;
    }
}