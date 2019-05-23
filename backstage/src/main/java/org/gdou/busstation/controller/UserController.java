package org.gdou.busstation.controller;

import org.gdou.busstation.dto.*;
import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping(path="/user")
    GetUserResponseDto getUser(GetUserRequestDto requests){
        System.out.println(requests.toString());
        GetUserResponseDto repsonse = userService.getUser(requests);
        return repsonse;
    }

    @PostMapping(path = "/updateUserInfo")
    CommonResponseDto updateUser(UpdateUserInputDto inputDto){
        CommonResponseDto responseDto = userService.updateUser(inputDto);
        return responseDto;
    }
}
