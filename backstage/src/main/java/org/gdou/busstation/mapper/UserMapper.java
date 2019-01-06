package org.gdou.busstation.mapper;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.gdou.busstation.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user")
    @ResultType(User.class)
    List<User> getAllUser();
}
