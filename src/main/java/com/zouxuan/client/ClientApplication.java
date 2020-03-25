package com.zouxuan.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zouxuan.auth", "com.zouxuan.client"})
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run( ClientApplication.class, args );
    }

}
