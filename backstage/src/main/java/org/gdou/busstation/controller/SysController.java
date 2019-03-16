package org.gdou.busstation.controller;

import org.gdou.busstation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sys")
public class SysController extends BaseController {

    @Autowired
    IUserService userService;

    //http://localhost:8080/sys/login?username=guest&password=guest
//    @RequestMapping(path="login",method = RequestMethod.GET, produces="application/json;charset=utf-8")//produces = MediaType.APPLICATION_JSON_UTF8
//    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
//        if(userService.findUser(username,password) != null){
//            System.out.println("登陆成功");
//            //request.setAttribute("登陆成功",userService.findUser(username,password));
//            model.addAttribute("登陆成功",userService.findUser(username,password));
//            //return "/html/index.html";
//            return "success";
//        }
//        return "fail";
//    }

    @ResponseBody
    //@RequestMapping(path = "login", method = RequestMethod.GET ,produces = "application/json;charset=utf-8\"")
    @RequestMapping(path="/login", method = RequestMethod.GET, produces="application/text;charset=utf-8")//produces = MediaType.APPLICATION_JSON_UTF8
    public String login(){
        System.out.println("进入控制器");
        return "success";
    }
}

//            DTO dto = new DTO();
//            dto.errCode = 1;
//            dto.errMsg = "success;";
//            dto.result = "username:guest  password:guest";
//return "redirect:/index.html";
//return dto.toJson();