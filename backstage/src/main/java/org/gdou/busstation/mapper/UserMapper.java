package org.gdou.busstation.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.gdou.busstation.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface UserMapper {

    @Select("select count(*) from user")
    int count();




//    @Select("select * from user where 1=1  order by id asc limit #{startIndex}, #{pageSize} ")

    //<if test='searchName != null and searchName != '''> and searchName =#{searchName} </if> <if test='searchStatus != null and searchStatus != '''> and searchStatus =#{searchStatus} </if>

//    @Select("<script> \n"+
//            "select * from user where 1=1 " +
//            "<if test='searchID != null and searchID != '''> and searchID =#{searchID} </if> " +
//            "</script> ")
        @Select({"<script>"+
                "select * from user where 1=1 "+
                "<if test='searchID!=\"\" and searchID!=null'>"+
                " and id like CONCAT(CONCAT('%', #{searchID}),'%') "+
                "</if>"+
                "<if test='searchName!=\"\" and searchName!=null'>"+
                " and name like CONCAT(CONCAT('%', #{searchName}),'%') "+
                "</if>"+
                "<if test='searchStatus!=\"\" and searchStatus!=null'>"+
                " and status = #{searchStatus} "+
                "</if>"+
                " order by id asc limit #{startIndex}, #{pageSize} " +
                "</script>"})
    @ResultType(User.class)
    List<User> getAllUser(@Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize,@Param("searchID")  String searchID,@Param("searchName") String searchName,@Param("searchStatus") String searchStatus);
}
