package org.gdou.busstation.mapper;

import org.apache.ibatis.annotations.*;
import org.gdou.busstation.dto.GetUserRequestDto;
import org.gdou.busstation.dto.UserDetailDto;
import org.gdou.busstation.model.User;
import org.gdou.busstation.tkMybatis.BaseMapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select count(*) from user")
    int count();

    //此方法用于统计上一次查询结果的总行数（不受limit限制）
    @Select("SELECT found_rows() AS rowcount")
    int lastTimeCount();

    //@SelectProvider(type = UserProvide.class, method = "getUserQuery")
    List<UserDetailDto> getUser(GetUserRequestDto request);

    //@SelectProvider(type = UserProvide.class, method = "getUserCountQuery")
    Integer getUserCount(GetUserRequestDto requestDto);

}
