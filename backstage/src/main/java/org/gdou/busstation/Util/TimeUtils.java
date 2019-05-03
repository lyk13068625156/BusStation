package org.gdou.busstation.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    /*
     * 将时间转换为时间戳
     */
    public static Long dateToStamp(String s) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long ts = null;
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
            ts = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //res = String.valueOf(ts);
        return ts;
    }

    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }


}
