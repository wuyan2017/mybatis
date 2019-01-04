package com.arc.first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主启动类
 */
@MapperScan("com.arc.first.mapper")
@SpringBootApplication
public class ZeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.arc.first.ZeroApplication.class, args);
    }

}

