package com.zouxuan.client;

import com.zouxuan.auth.PermissionScope;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class ClientController {
    @GetMapping("/test")
    @PermissionScope("admin")
    public void authTest() {
        System.out.println( "aaa" );

    }
}
