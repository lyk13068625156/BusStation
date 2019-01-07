package org.gdou.busstation.controller;

import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController  extends BaseController{

    @Autowired
    private IUserService userService;

    //@RequestMapping(path="/getAllUser.do", produces="text/html;charset=utf-8")
    @RequestMapping(path="/getAllUser.do", produces="application/json;charset=utf-8")
    @ResponseBody
    PageModel getAllUser(Integer pageNumber, Integer pageSize){
        System.out.println("请求控制器成功");
        System.out.println(pageNumber);
        System.out.println(pageSize);

        List<User> userList = userService.getAllUser();
        for (int i = 0;i < userList.size(); i++){
            System.out.println(userList.get(i));;
        }
        PageModel pageModel = new PageModel();
        pageModel.setRows(userList);
        pageModel.setTotal(userList.size());
        //String rs = JSON.toJSONString(userList);
        return pageModel;
    }
}
