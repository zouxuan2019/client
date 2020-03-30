package com.zouxuan.client;

import com.zouxuan.auth.PermissionScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {
    @Value("${environment}")
    private String myConfig;

    @GetMapping("/test")
    @PermissionScope("admin")
    public void authTest() {
        System.out.println( myConfig );

    }

    @GetMapping("/anon/test")
    public void authTest2() {
        System.out.println( "mmm" );

    }


}

