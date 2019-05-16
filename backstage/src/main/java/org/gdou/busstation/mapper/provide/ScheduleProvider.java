package org.gdou.busstation.mapper.provide;


import org.apache.commons.lang3.tuple.Pair;
import org.apache.ibatis.jdbc.SQL;
import org.gdou.busstation.Util.PageableUtils;
import org.gdou.busstation.dto.GetScheduleRequestDto;

public class ScheduleProvider {

    public String getSchedule(GetScheduleRequestDto requestDto){
        SQL sql = new SQL(){{

        }};
        StringBuilder sb = new StringBuilder(sql.toString());
        Pair<Integer, Integer> page = PageableUtils.checkPage(requestDto.getOffset(), requestDto.getLimit());
        sb.append(" limit " + page.getLeft() + "," + page.getRight());
        return sb.toString();
    }

    public String getScheduleCount(GetScheduleRequestDto requestDto){
        SQL sql = new SQL(){{

        }};
        return sql.toString();
    }
}
