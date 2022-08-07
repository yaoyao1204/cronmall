package com.example.cronmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@MapperScan("com.example.cronmall.mapper")
public class CronmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(CronmallApplication.class, args);
    }

}
