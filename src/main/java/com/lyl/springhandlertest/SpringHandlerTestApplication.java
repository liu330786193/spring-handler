package com.lyl.springhandlertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:spring-elastic-job.xml")
@SpringBootApplication
public class SpringHandlerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHandlerTestApplication.class, args);
    }
}
