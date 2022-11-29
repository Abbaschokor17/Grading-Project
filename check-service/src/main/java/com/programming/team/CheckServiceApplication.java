package com.programming.team;

import com.programming.team.model.Check;
import com.programming.team.repository.CheckRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient
@SpringBootApplication
public class CheckServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(CheckRepository checkRepository) {
        return args -> {
            Check check = new Check();
            check.setMatricule("192474");
            check.setFullnamestudent("Abbas Chokor");
            check.setPresent(1);

            Check check1 = new Check();
            check1.setMatricule("123456");
            check1.setFullnamestudent("gabi bo");
            check1.setPresent(1);

            checkRepository.save(check);
            checkRepository.save(check1);
        };
    }
}
