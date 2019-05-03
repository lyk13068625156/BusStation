package org.gdou.busstation.mapper.provide;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.ibatis.jdbc.SQL;
import org.gdou.busstation.Util.PageableUtils;
import org.gdou.busstation.dto.GetStationRequestDto;

public class StationProvider {

    public String getStation(GetStationRequestDto requestDto){
        SQL sql = new SQL(){{
           SELECT("*");
           FROM("station");
           if (requestDto.getId() != null && StringUtils.isNotBlank(requestDto.getId().toString())){
               WHERE("id = #{id}");
           }
           if (requestDto.getName() != null && StringUtils.isNotBlank(requestDto.getName())){
               WHERE("name like CONCAT('%', #{name}, '%')");
           }
           if (requestDto.getProvinceCode() != null && StringUtils.isNotBlank(requestDto.getProvinceCode().toString())){
               WHERE("province_code = #{provinceCode}");
           }
           if (requestDto.getCityCode() != null && StringUtils.isNotBlank(requestDto.getCityCode().toString())){
                WHERE("city_code = #{cityCode}");
           }
           if (requestDto.getSectionCode() != null && StringUtils.isNotBlank(requestDto.getSectionCode().toString())){
                WHERE("section_code = #{sectionCode}");
           }
           if (requestDto.getProvince() != null && StringUtils.isNotBlank(requestDto.getProvince())){
                WHERE("province like CONCAT('%', #{province}, '%')");
           }
           if (requestDto.getCity() != null && StringUtils.isNotBlank(requestDto.getCity())){
               WHERE("city like CONCAT('%', #{city}, '%')");
           }
           if (requestDto.getSection() != null && StringUtils.isNotBlank(requestDto.getSection())){
               WHERE("section like CONCAT('%', #{section}, '%')");
           }
           if (requestDto.getStatus() != null && StringUtils.isNotBlank(requestDto.getStatus().toString())){
               WHERE("status = #{status}");
           }
        }};
        Pair<Integer, Integer> page = PageableUtils.checkPage(requestDto.getOffset(), requestDto.getLimit());
        StringBuilder sb = new StringBuilder(sql.toString());
        sb.append(" limit " + page.getRight());
        sb.append(" offset " + page.getLeft());
        return sb.toString();
    }

    public String getStationCount(GetStationRequestDto requestDto){
        SQL sql = new SQL(){{
            SELECT("count(id)");
            FROM("station");
            if (requestDto.getId() != null && StringUtils.isNotBlank(requestDto.getId().toString())){
                WHERE("id = #{id}");
            }
            if (requestDto.getName() != null && StringUtils.isNotBlank(requestDto.getName())){
                WHERE("name like CONCAT('%', #{name}, '%')");
            }
            if (requestDto.getProvinceCode() != null && StringUtils.isNotBlank(requestDto.getProvinceCode().toString())){
                WHERE("province_code = #{provinceCode}");
            }
            if (requestDto.getCityCode() != null && StringUtils.isNotBlank(requestDto.getCityCode().toString())){
                WHERE("city_code = #{cityCode}");
            }
            if (requestDto.getSectionCode() != null && StringUtils.isNotBlank(requestDto.getSectionCode().toString())){
                WHERE("section_code = #{sectionCode}");
            }
            if (requestDto.getProvince() != null && StringUtils.isNotBlank(requestDto.getProvince())){
                WHERE("province like CONCAT('%', #{province}, '%')");
            }
            if (requestDto.getCity() != null && StringUtils.isNotBlank(requestDto.getCity())){
                WHERE("city like CONCAT('%', #{city}, '%')");
            }
            if (requestDto.getSection() != null && StringUtils.isNotBlank(requestDto.getSection())){
                WHERE("section like CONCAT('%', #{section}, '%')");
            }
            if (requestDto.getStatus() != null && StringUtils.isNotBlank(requestDto.getStatus().toString())){
                WHERE("status = #{status}");
            }
        }};
        return sql.toString();
    }
}
