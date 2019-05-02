package org.gdou.busstation.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.gdou.busstation.Util.BusStationContants;
import org.gdou.busstation.Util.ObjectUtils;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.exception.ServiceException;
import org.gdou.busstation.mapper.UserMapper;
import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public GetUserResponseDto getUser(GetUserRequestDto request) {
//        User user = JSONObject.parseObject(JSON.toJSONString(request), User.class);
        List<UserDetailDto> userDetailDtos = userMapper.getUser(request);
        int count = userMapper.getUserCount(request);
        GetUserResponseResultDto resultDto = new GetUserResponseResultDto();
        resultDto.setCount(count);
        resultDto.setItems(userDetailDtos);
        return new GetUserResponseDto().code(0).success(true).result(resultDto);
    }

    @Override
    @Transactional
    public CommonResponseDto updateUser(UpdateUserInputDto inputDto) {
        User foundUser = userMapper.selectByPrimaryKey(inputDto.getId());
        if (foundUser == null){
            throw new ServiceException(BusStationContants.SYS_USER_TYPE_ERROR,"该用户不存在");
        }
        if (foundUser.getType() == BusStationContants.TYPE_ADMIN){
            throw new ServiceException(BusStationContants.SYS_USER_TYPE_ERROR,"权限不足");
        }
        ObjectUtils.copy(inputDto, foundUser);
        int i = userMapper.updateByPrimaryKeySelective(foundUser);
        CommonResponseDto responseDto = new CommonResponseDto();
        if (i == 1){
            responseDto.code(0).success(true).message("更新成功");
        }else {
            responseDto.code(1).success(false).message("更新失败");
        }
        return responseDto;
    }
}
