package com.demo.springcloudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class SpringCloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApiApplication.class, args);
    }

}
