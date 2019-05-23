package org.gdou.busstation;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.tomcat.jni.Time;
import org.gdou.busstation.dto.ListViaDto;
import org.gdou.busstation.model.Schedule;
import org.gdou.busstation.model.Station;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonTest {

    @Test
    public void formatTest(){
        BigDecimal times = BigDecimal.valueOf(100);
        Double price = 0.000001546456536356864574363456459999;
        System.out.println(BigDecimal.valueOf(price));
        System.out.println( BigDecimal.valueOf(price).setScale(2,BigDecimal.ROUND_HALF_UP).intValue());
        int prices = BigDecimal.valueOf(price).setScale(2,BigDecimal.ROUND_HALF_UP).multiply(times).intValue();
        System.out.println(prices);
    }

    @Test
    public void testTIme() throws ParseException {
        LocalTime parse = LocalTime.parse("13:14:15");
        System.out.println(parse);
    }

    @Test
    public void testList(){
        List<Integer> i = new ArrayList<>();
        i.add(0);
        i.add(1);
        System.out.println(i.get(3));
    }

    @Test
    public void testList2(){
        java.util.List<Integer> station = new ArrayList<>();
        station.add(11);
        station.add(22);
        station.add(33);
        java.util.List<Integer> distance = new ArrayList<>();
        distance.add(111);
        distance.add(222);
        distance.add(333);
        java.util.List<LocalTime> leaveTime = new ArrayList<>();
        leaveTime.add(LocalTime.now());
        leaveTime.add(LocalTime.now().plusHours(1));
        leaveTime.add(LocalTime.now().plusHours(2));
        java.util.List<Double> price = new ArrayList<>();
        price.add(1.0);
        price.add(2.0);
        price.add(3.0);

        int total = station.size();
        java.util.List<ListViaDto> viaDtoList = new LinkedList<>();
        for (int i = 0; i < total ; i++) {
            ListViaDto via = new ListViaDto();
            via.setId(station.get(i));
            //via.setTime(leaveTime.get(i).minusNanos(0).toString());
            LocalTime time = leaveTime.get(i);
            String timeStr = time.getHour()+":"+time.getMinute()+":"+time.getSecond();
            via.setTime(timeStr);
            via.setDistance(distance.get(i));
            via.setPrice(price.get(i));
            viaDtoList.add(via);
        }
//        JSONObject object = JSONObject.parseObject(viaDtoList.toString());
//        String s1 = object.toJSONString();
//        System.out.println(s1);
//        JSONArray objects = new JSONArray(Collections.singletonList(viaDtoList));
//        String s = objects.toJSONString();
//        System.out.println(s);

        String s1 = net.minidev.json.JSONArray.toJSONString(viaDtoList);
        System.out.println(s1);

        JSONArray objects = JSONObject.parseArray(s1);
        int size = objects.size();
        for (int i = 0; i < size; i++) {
            JSONObject object = JSONObject.parseObject(objects.get(i).toString());
            Integer id = object.getInteger("id");
            String time = object.getString("time");
            Integer distance1 = object.getInteger("distance");
            Double price1 = object.getDouble("price");
            System.out.println(id + " " + time + " " + distance1 + " " + price1 );
        }
    }

    @Test
    public void testTime(){
        Date time = new Date(1557331200000L);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sd.format(time));
    }
}
