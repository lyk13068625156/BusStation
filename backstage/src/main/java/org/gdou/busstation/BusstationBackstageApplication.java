package org.gdou.busstation;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@ComponentScan(basePackages={"org.gdou.busstation"})
@MapperScan("org.gdou.busstation.mapper")
public class BusstationBackstageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BusstationBackstageApplication.class, args);
    }

}

