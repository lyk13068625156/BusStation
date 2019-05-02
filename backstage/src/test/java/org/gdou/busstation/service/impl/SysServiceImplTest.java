package org.gdou.busstation.service.impl;

import com.mysql.jdbc.ReflectiveStatementInterceptorAdapter;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.service.SysService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysServiceImplTest {

    @Autowired
    SysService sysService;

    @Test
    public void register() {
        RegisterInputDto input = new RegisterInputDto();
        input.setUserName("testRegisterUserName2");
        input.setPassword("testRegisterPassword2");
        System.out.println(sysService.register(input));
    }

    @Test
    public void login() {
        LoginRequestDto request = new LoginRequestDto();
        LoginInputDto input = new LoginInputDto();
        input.setUserName("testRegisterUserName");
        input.setPassword("testRegisterPassword");
        request.setLoginInput(input);
        //System.out.println(sysService.login(request));
    }

    @Test
    public void reset() {
        ResetInputDto input = new ResetInputDto();
        input.setUserName("二号");
        input.setOldPassword("二号");
        input.setNewPassword("二号新密码");
        //input.setUserName("testRegisterUserName");
        //input.setOldPassword("testRegisterPassword");
        //input.setNewPassword("testRegisterNewPassword");
        System.out.println(sysService.reset(input));
    }
}