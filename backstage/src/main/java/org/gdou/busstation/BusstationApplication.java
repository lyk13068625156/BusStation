package org.gdou.busstation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.gdou.busstation"})
@MapperScan("org.gdou.busstation.mapper")
public class BusstationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BusstationApplication.class, args);
        //System.out.println("测试");
    }

}

