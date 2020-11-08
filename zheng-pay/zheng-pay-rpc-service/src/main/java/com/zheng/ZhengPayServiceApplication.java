package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath*:META-INF/spring/applicationContext*.xml"})
@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
public class ZhengPayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengPayServiceApplication.class, args);
    }

}
