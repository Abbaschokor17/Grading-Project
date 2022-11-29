package com.programming.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GradeServiceApplication {
    public static void main(String[] args) {
        {
            SpringApplication.run(GradeServiceApplication.class, args);
        }

    }
}