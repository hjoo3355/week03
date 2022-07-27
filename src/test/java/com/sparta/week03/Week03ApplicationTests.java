package com.sparta.week03;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootTest
class Week03AssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week03AssignmentApplication.class, args);
    }

}