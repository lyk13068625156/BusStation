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

    @Select("select count(*) from user")
    int count();

    @Select("select * from user order by id asc limit #{startIndex}, #{pageSize} ")
    @ResultType(User.class)
    List<User> getAllUser(Integer startIndex, Integer pageSize);
}
