package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath*:META-INF/spring/applicationContext*.xml"})
@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class ZhengApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengApiServiceApplication.class, args);
    }

}
