package com.angularspringbootecommerce.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.angularspringbootecommerce.backend.repository")

public class PreeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PreeeApplication.class, args);
    }

}
