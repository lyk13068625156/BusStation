package org.gdou.busstation.controller;

import org.gdou.busstation.dto.CommonResponseDto;
import org.gdou.busstation.dto.GetUserRequestDto;
import org.gdou.busstation.dto.GetUserResponseDto;
import org.gdou.busstation.dto.UserDetailDto;
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
public class UserController  extends BaseController{

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

//    @RequestMapping(path="/getAllUser.do", produces="application/json;charset=utf-8")
//    @ResponseBody
//    PageModel getAllUser(Integer pageNumber, Integer pageSize, String searchID, String searchName, String searchStatus){
//        System.out.println("请求控制器成功");
//        System.out.println(pageNumber);
//        System.out.println(pageSize);
//        System.out.println(searchID);
//        System.out.println(searchName);
//        System.out.println(searchStatus);
//        //在controller这里把(pageNumber,pageSize)---->(startIndex,pageSize)，以适应数据库sql语句
//        //int startIndex = (pageNumber-1) * pageSize;
//        return userService.getAllUser(pageNumber,pageSize,searchID,searchName,searchStatus);
//    }

//    @RequestMapping(path="/user", method = RequestMethod.POST, produces="application/json;charset=utf-8")
//    CommonResponseDto getUser(@RequestBody GetUserRequestDto request){
//        System.out.println(request.toString());
//        List<User> users = userService.getUser(request);
//        if(users != null && !users.isEmpty()){
//            for (User user : users) {
//                System.out.println("userId" + user.getId());
//            }
//        }
//        return new CommonResponseDto().code(0).success(true);
//    }

    @RequestMapping(path="/user", method = RequestMethod.GET, produces="application/json;charset=utf-8")
    GetUserResponseDto getUser(GetUserRequestDto request){
        GetUserResponseDto repsonse = userService.getUser(request);
        return repsonse;
    }

}
