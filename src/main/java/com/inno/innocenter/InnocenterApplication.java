package com.inno.innocenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InnocenterApplication {

    public static void main(String[] args) {

        SpringApplication.run(InnocenterApplication.class, args);
    }

}
