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
//@RequestMapping("/user")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

//    @PostMapping(path="/user?page={page}&limit={limit}")      @PathVariable("page") Integer page, @PathVariable("limit") Integer limit
    @PostMapping(path="/user")
    GetUserResponseDto getUser(@RequestBody GetUserRequestDto requests){
        System.out.println(requests.toString());
//        request.setPage(page);
//        request.setLimit(limit);
        GetUserResponseDto repsonse = userService.getUser(requests);
        return repsonse;
    }

    @PostMapping(path = "/updateUserInfo")
    CommonResponseDto updateUser(UpdateUserInputDto inputDto){
        CommonResponseDto responseDto = userService.updateUser(inputDto);
        return responseDto;
    }
}
