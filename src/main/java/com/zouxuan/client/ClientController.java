package com.zouxuan.client;

import com.zouxuan.auth.PermissionScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {


    @GetMapping("/test")
    @PermissionScope("admin")
    public void authTest() {
        System.out.println( "aaa" );

    }

    @GetMapping("/anon/test")
    public void authTest2() {
        System.out.println( "mmm" );

    }


}

