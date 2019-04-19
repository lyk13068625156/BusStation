package org.gdou.busstation.service.impl;

import com.sun.xml.internal.bind.v2.TODO;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.SelectProvider;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.mapper.UserMapper;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.SysService;
import org.mockito.internal.configuration.injection.SpyOnInjectedFieldsHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.net.PasswordAuthentication;
import java.net.ResponseCache;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class SysServiceImpl implements SysService {

    @Autowired
    UserMapper userMapper;

    @Transactional
    @Override
    public CommonResponseDto register(RegisterInputDto input) {
        CommonResponseDto response = new CommonResponseDto();
        User user = new User();
        user.setUserName(input.getUserName());
        User check = userMapper.selectOne(user);
        if (check != null){
            return response.code(1).success(false).message("该用户名已存在");
        }
        //新增的用户
        User userNew = new User();
        userNew.setUserName(input.getUserName());
        userNew.setPassword(input.getPassword());
        userNew.setStatus(2);
        userNew.setType(1);
        userNew.setCreateTime(new Date());
        int i = userMapper.insert(userNew);
        if (i == 1){
            response.code(0).success(true).message("注册成功");
        }else
            response.code(1).success(false).message("注册失败");
        return response;
    }

    @Transactional
    @Override
    public CommonResponseDto login(LoginInputDto input) {
        //LoginInputDto input = request.getLoginInput();
        //TODO
        System.out.println(input.toString());
        User user = new User();
        user.setUserName(input.getUserName() == null ? "" : input.getUserName());
        user.setPassword(input.getPassword() == null ? "" : input.getPassword());
        User foundUser = userMapper.selectOne(user);
        CommonResponseDto response = new CommonResponseDto();

        if (Objects.nonNull(foundUser)) {
            if(foundUser.getStatus() != BusStationContants.STATUS_ENABLED){
                response.code(1).success(false).message("账号被禁用");
            }else if(foundUser.getType() != BusStationContants.TYPE_ADMIN){
                response.code(1).success(false).message("账号权限错误");
            }else {
                response.code(0).success(true).message("登陆成功");
            }
        }else
            response.code(1).success(false).message("账号不存在");
        return response;
    }

    @Transactional
    @Override
    public CommonResponseDto reset(ResetRequestDto request) {
        ResetInputDto input = request.getResetInput();
        String userName = input.getUserName();
        String oldPassword = input.getOldPassword();
        String newPassword = input.getNewPassword();
        User user = new User();
        user.setUserName(userName);
        user.setPassword(oldPassword);
        user.setType(BusStationContants.TYPE_ADMIN);//只能更新管理员身份的记录，禁用状态也可以改密码
        User foundUser = userMapper.selectOne(user);
        CommonResponseDto response = new CommonResponseDto();
        if (Objects.nonNull(foundUser)) {
            foundUser.setPassword(newPassword);
            int i = userMapper.updateByPrimaryKeySelective(foundUser);
            if (i == 1){
                response.code(0).success(true).message("重置成功");
            }else
                response.code(1).success(false).message("重置失败1");
        }else
            response.code(1).success(false).message("重置失败2");
        return response;
    }
}
