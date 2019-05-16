package org.gdou.busstation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

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
}
