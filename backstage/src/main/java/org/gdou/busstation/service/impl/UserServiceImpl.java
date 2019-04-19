package org.gdou.busstation.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.gdou.busstation.dto.*;
import org.gdou.busstation.mapper.UserMapper;
import org.gdou.busstation.model.PageModel;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public GetUserResponseDto getUser(GetUserRequestDto request) {
        User user = JSONObject.parseObject(JSON.toJSONString(request), User.class);
        List<UserDetailDto> userDetailDtos = userMapper.getUser(request);
        int total = userMapper.getUserCount(request);
        GetUserResponseResultDto resultDto = new GetUserResponseResultDto();
        resultDto.setTotal(total);
        resultDto.setItems(userDetailDtos);
        System.out.println(total);
        System.out.println(resultDto.toString());
        return new GetUserResponseDto().code(0).success(true).result(resultDto);
    }
}
