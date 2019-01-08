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
    public PageModel getAllUser(Integer pageNumber, Integer pageSize) {
        //实例化部分参数
        PageModel pageModel = new PageModel();
        pageModel.setPageNumber(pageNumber);
        pageModel.setPageSize(pageSize);

        //生成数据库所需startIndex，获取数据，获取总数
        int startIndex = (pageNumber - 1) * pageSize;
        List<User> userList = userMapper.getAllUser(startIndex, pageSize);
        int total = userMapper.count();

        //赋值总数、查询结果
        pageModel.setRows(userList);
        pageModel.setTotal(total);

        return pageModel;
    }
}
