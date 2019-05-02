package org.gdou.busstation.mapper.provide;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.ibatis.jdbc.SQL;
import org.gdou.busstation.Util.PageableUtils;
import org.gdou.busstation.dto.GetUserRequestDto;

public class UserProvider {
    public String getUser(GetUserRequestDto request){
        SQL sql = new SQL(){{
            SELECT("id,user_name,name,id_card,sex,phone,email,type,status,create_time");
            FROM("user");
            // todo 判断空字符串种类
            if (request.getId() != null && StringUtils.isNotBlank(request.getId().toString())){
                WHERE("id = #{id}");
            }
            if (StringUtils.isNotBlank(request.getUserName())){
                WHERE("user_name like CONCAT('%', #{userName}, '%')");
            }
            if (StringUtils.isNotBlank(request.getName())){
                WHERE("name like CONCAT('%', #{name}, '%')");
            }
            if (request.getSex() != null && StringUtils.isNotBlank(request.getSex().toString())){
                WHERE("sex = #{sex}");
            }
            if (StringUtils.isNotBlank(request.getPhone())){
                WHERE("phone like CONCAT('%', #{phone}, '%')");
            }
            if (request.getStatus() != null && StringUtils.isNotBlank(request.getStatus().toString())){
                WHERE("status = #{status}");
            }
            if (request.getType() != null && StringUtils.isNotBlank(request.getType().toString())){
                WHERE("type = #{type}");
            }
        }};
        StringBuilder sb = new StringBuilder(sql.toString());
        Pair<Integer, Integer> page = PageableUtils.checkPage(request.getOffset(), request.getLimit());
        sb.append(" limit " + page.getRight());
        sb.append(" offset " + page.getLeft());
        return sb.toString();
    }
    public String getUserCount(GetUserRequestDto request){
        SQL sql = new SQL(){{
            SELECT("count(id)");
            FROM("user");
            // todo 判断空字符串种类
            if (request.getId() != null && StringUtils.isNotBlank(request.getId().toString())){
                WHERE("id = #{id}");
            }
            if (StringUtils.isNotBlank(request.getUserName())){
                WHERE("user_name like CONCAT('%', #{userName}, '%')");
            }
            if (StringUtils.isNotBlank(request.getName())){
                WHERE("name like CONCAT('%', #{name}, '%')");
            }
            if (request.getSex() != null && StringUtils.isNotBlank(request.getSex().toString())){
                WHERE("sex = #{sex}");
            }
            if (StringUtils.isNotBlank(request.getPhone())){
                WHERE("phone like CONCAT('%', #{phone}, '%')");
            }
            if (request.getStatus() != null && StringUtils.isNotBlank(request.getStatus().toString())){
                WHERE("status = #{status}");
            }
            if (request.getType() != null && StringUtils.isNotBlank(request.getType().toString())){
                WHERE("type = #{type}");
            }
        }};
        return sql.toString();
    }
}
