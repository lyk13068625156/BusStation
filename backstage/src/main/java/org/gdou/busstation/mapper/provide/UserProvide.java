package org.gdou.busstation.mapper.provide;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;
import org.gdou.busstation.dto.GetUserRequestDto;

public class UserProvide {
    public String getUserQuery(GetUserRequestDto request){
        SQL sql = new SQL(){{
            SELECT("u.id,u.user_name,u.name,u.id_card,u.sex,u.phone,u.email,u.type,u.status");
            FROM("user as u");
            if (request.getId() != null){
                WHERE("u.id = #{id}");
            }
            if (StringUtils.isNotBlank(request.getUserName())){
                WHERE("u.user_name like CONCAT('%', #{userName}, '%')");
            }
            if (StringUtils.isNotBlank(request.getPhone())){
                WHERE("u.phone = #{phone}");
            }
            if (request.getStatus() != null){
                WHERE("u.status = #{status}");
            }
            if (request.getType() != null){
                WHERE("u.type = #{type}");
            }
        }};
        StringBuilder sb = new StringBuilder();
        sb.append(sql.toString());

        if(request.getLimit() == null){
            sb.append(" limit 10 ");
        }else {
            sb.append(" limit ").append(request.getLimit());
        }

        if (request.getOffset() == null) {
            sb.append(" offset 0 ");
        } else {
            sb.append(" offset ").append(request.getOffset());
        }
        return sb.toString();
    }
    public String getUserCountQuery(GetUserRequestDto request){
        SQL sql = new SQL(){{
            SELECT("count(id)");
            FROM("user");
            if (request.getId() != null){
                WHERE("id = #{id}");
            }
            if (StringUtils.isNotBlank(request.getUserName())){
                WHERE("user_name like CONCAT('%', #{userName}, '%')");
                WHERE("user_name like CONCAT('%', #{userName}, '%')");
            }
            if (StringUtils.isNotBlank(request.getPhone())){
                WHERE("phone = #{phone}");
            }
            if (request.getStatus() != null){
                WHERE("status = #{status}");
            }
            if (request.getType() != null){
                WHERE("type = #{type}");
            }
        }};
        return sql.toString();
    }
}
