package org.gdou.busstation.mapper.provide;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.ibatis.jdbc.SQL;
import org.gdou.busstation.Util.PageableUtils;
import org.gdou.busstation.dto.GetListRequestDto;

public class ListProvider {

    public String getList(GetListRequestDto requestDto){
        SQL sql = new SQL(){{
            SELECT("*");
            FROM("list");
            if (requestDto.getId() != null && StringUtils.isNotBlank(requestDto.getId().toString())){
                WHERE("id = #{id}");
            }
            if (requestDto.getName() != null && StringUtils.isNotBlank(requestDto.getName())){
                WHERE("name like CONCAT('%', #{name}, '%')");
            }
//            if (requestDto.getFirstStationName() != null && StringUtils.isNotBlank(requestDto.getFirstStationName())){
//                WHERE("first_station_name like CONCAT('%', #{firstStationName}, '%')");
//            }
//            if (requestDto.getLastStationName() != null && StringUtils.isNotBlank(requestDto.getLastStationName())){
//                WHERE("last_station_name like CONCAT('%', #{lastStationName}, '%')");
//            }
//            if (requestDto.getVia() != null && StringUtils.isNotBlank(requestDto.getVia())){
//                WHERE("via like CONCAT('%', #{via}, '%')");
//            }
            if (requestDto.getStatus() != null){
                WHERE("status = #{status}");
            }
        }};
        StringBuilder sb = new StringBuilder(sql.toString());
        Pair<Integer, Integer> page = PageableUtils.checkPage(requestDto.getOffset(), requestDto.getLimit());
        sb.append(" limit " + page.getLeft() + "," + page.getRight());
        return sb.toString();
    }

    public String getListCount(GetListRequestDto requestDto){
        SQL sql = new SQL(){{
            SELECT("count(id)");
            FROM("list");
            if (requestDto.getId() != null && StringUtils.isNotBlank(requestDto.getId().toString())){
                WHERE("id = #{id}");
            }
            if (requestDto.getName() != null && StringUtils.isNotBlank(requestDto.getName())){
                WHERE("name like CONCAT('%', #{name}, '%')");
            }
            if (requestDto.getFirstStationName() != null && StringUtils.isNotBlank(requestDto.getFirstStationName())){
                WHERE("first_station_name like CONCAT('%', #{firstStationName}, '%')");
            }
            if (requestDto.getLastStationName() != null && StringUtils.isNotBlank(requestDto.getLastStationName())){
                WHERE("last_station_name like CONCAT('%', #{lastStationName}, '%')");
            }
            if (requestDto.getVia() != null && StringUtils.isNotBlank(requestDto.getVia())){
                WHERE("via like CONCAT('%', #{via}, '%')");
            }
            if (requestDto.getStatus() != null && StringUtils.isNotBlank(requestDto.getStatus().toString())){
                WHERE("status = #{status}");
            }
        }};
        return sql.toString();
    }

}
