package com.arun.ospringsecurity.goals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @author arun on 11/19/20
 */

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GoalsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoalsApplication.class);
    }
}
