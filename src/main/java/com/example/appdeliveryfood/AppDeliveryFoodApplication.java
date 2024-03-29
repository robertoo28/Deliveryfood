package com.example.appdeliveryfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@EntityScan("com.example.appdeliveryfood.Modelo")
@SpringBootApplication
public class AppDeliveryFoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDeliveryFoodApplication.class, args);
    }

}
