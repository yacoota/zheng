package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath*:applicationContext*.xml"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZhengMessageWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengMessageWebApplication.class, args);
    }

}
