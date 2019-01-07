package org.gdou.busstation.service.impl;

import org.gdou.busstation.mapper.UserMapper;
import org.gdou.busstation.model.User;
import org.gdou.busstation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
