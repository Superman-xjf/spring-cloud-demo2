package com.xjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceCloudEureka8612Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudEureka8612Application.class,args);
    }
}
