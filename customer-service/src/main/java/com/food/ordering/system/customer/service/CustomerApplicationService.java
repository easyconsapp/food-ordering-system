package com.food.ordering.system.customer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.food.ordering.system")
public class CustomerApplicationService {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplicationService.class, args);
    }
}
