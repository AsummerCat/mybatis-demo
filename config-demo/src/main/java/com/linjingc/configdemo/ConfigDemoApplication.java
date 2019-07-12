package com.linjingc.configdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置篇
 */
@SpringBootApplication
//包扫描
@MapperScan("com.linjingc.configdemo.dao")
public class ConfigDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigDemoApplication.class, args);
    }

}
