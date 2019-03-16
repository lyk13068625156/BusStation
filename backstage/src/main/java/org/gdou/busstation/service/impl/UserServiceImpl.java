package org.gdou.busstation.service.impl;

import org.gdou.busstation.mapper.UserMapper;
import org.gdou.busstation.model.PageModel;
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
    public PageModel getAllUser(Integer pageNumber, Integer pageSize, String searchID, String searchName, String searchStatus) {
        //实例化部分参数
        PageModel pageModel = new PageModel();
        pageModel.setPageNumber(pageNumber);
        pageModel.setPageSize(pageSize);

        //生成数据库所需startIndex，获取数据，获取总数
        int startIndex = (pageNumber - 1) * pageSize;
        List<User> userList = userMapper.getAllUser(startIndex,pageSize,searchID,searchName,searchStatus);

        //获取上面这个语句调用mapper后返回结果的总行数（不受limit限制）
        int total = userMapper.lastTimeCount();
        System.out.println("total:" + total);

        //赋值总数、查询结果
        pageModel.setRows(userList);
        pageModel.setTotal(total);

        return pageModel;
    }

    @Override
    public User findUser(String userID, String password) {

        return userMapper.findUser(userID,password);
    }

}
