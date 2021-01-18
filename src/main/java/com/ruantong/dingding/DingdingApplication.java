package com.ruantong.dingding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ruantong.dingding.mapper")
public class DingdingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DingdingApplication.class, args);
    }

}
