package org.gdou.busstation.service.impl;

import com.sun.xml.internal.bind.v2.TODO;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.SelectProvider;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.Util.ObjectUtils;
import org.gdou.busstation.Util.TimeUtils;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.exception.ServiceException;
import org.gdou.busstation.mapper.UserMapper;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.SysService;
import org.mockito.internal.configuration.injection.SpyOnInjectedFieldsHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.net.PasswordAuthentication;
import java.net.ResponseCache;
import java.nio.channels.ReadPendingException;
import java.text.ParseException;
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
    public CommonResponseDto reset(ResetInputDto input) {
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
                response.code(1).success(false).message("重置失败");
        }else
            response.code(1).success(false).message("重置失败");
        return response;
    }

    @Override
    @Transactional
    public GetMyInfoResponseDto getMyInfo(GetMyInfoRequestDto requestDto) {
        GetMyInfoResponseDto responseDto = new GetMyInfoResponseDto();
        String userName = requestDto.getUserName();
        User user = new User();
        user.setUserName(userName);
        User foundUser = userMapper.selectOne(user);
        if (foundUser == null){
            responseDto.code(1).success(false).message("未找到userName = " + userName + " 的用户");
        }else {
//            ObjectUtils.copy(foundUser,responseDto);//把获取到的对象的值copy到外部dto
            responseDto.code(0).success(true);
            responseDto.setId(foundUser.getId());
            responseDto.setUserName(foundUser.getUserName());
            responseDto.setName(foundUser.getName());
            responseDto.setIdCard(foundUser.getIdCard());
            responseDto.setSex(foundUser.getSex());
            responseDto.setPhone(foundUser.getPhone());
            responseDto.setEmail(foundUser.getEmail());
            responseDto.setType(foundUser.getType());
            responseDto.setStatus(foundUser.getStatus());
            responseDto.setCreateTime(foundUser.getCreateTime().getTime());
        }
        return responseDto;
    }

    @Override
    @Transactional
    public CommonResponseDto updateMyInfo(UpdateMyInfoInputDto inputDto){
        User user = new User();
        user.setId(inputDto.getId());
        User foundUser = userMapper.selectByPrimaryKey(user);
        if (foundUser == null)
        {
            throw new ServiceException(BusStationContants.SYS_NOT_FOUND,String.format("该用户不存在,id=%d",inputDto.getId()));
        }
        foundUser.setName(inputDto.getName());
        foundUser.setIdCard(inputDto.getIdCard());
        foundUser.setSex(inputDto.getSex());
        foundUser.setPhone(inputDto.getPhone());
        foundUser.setEmail(inputDto.getEmail());
        userMapper.updateByPrimaryKeySelective(foundUser);
        return new CommonResponseDto().code(0).success(true);
    }
}
