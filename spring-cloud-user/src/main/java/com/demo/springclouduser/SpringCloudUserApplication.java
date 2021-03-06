package com.demo.springclouduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUserApplication.class, args);
    }

}
