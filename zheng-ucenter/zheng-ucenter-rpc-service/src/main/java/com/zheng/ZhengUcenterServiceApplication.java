package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath*:META-INF/spring/applicationContext*.xml"})
@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
public class ZhengUcenterServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZhengUcenterServiceApplication.class, args);
    }

}
