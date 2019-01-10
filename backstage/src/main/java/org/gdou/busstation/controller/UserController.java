package org.gdou.busstation.controller;

import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController  extends BaseController{

    @Autowired
    private IUserService userService;

    @RequestMapping(path="/getAllUser.do", produces="application/json;charset=utf-8")
    @ResponseBody
    PageModel getAllUser(Integer pageNumber, Integer pageSize, String searchID, String searchName, String searchStatus){
        System.out.println("请求控制器成功");
        System.out.println(pageNumber);
        System.out.println(pageSize);
        System.out.println(searchID);
        System.out.println(searchName);
        System.out.println(searchStatus);
        //在controller这里把(pageNumber,pageSize)---->(startIndex,pageSize)，以适应数据库sql语句
        //int startIndex = (pageNumber-1) * pageSize;

        return userService.getAllUser(pageNumber,pageSize,searchID,searchName,searchStatus);
    }
}
