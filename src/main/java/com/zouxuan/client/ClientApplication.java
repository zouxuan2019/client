package com.zouxuan.client;

import com.zouxuan.auth.EnableAuth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAuth
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run( ClientApplication.class, args );
    }

}
