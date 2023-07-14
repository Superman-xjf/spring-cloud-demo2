package com.xjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudConsumerDept8900Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerDept8900Application.class,args);
    }
}