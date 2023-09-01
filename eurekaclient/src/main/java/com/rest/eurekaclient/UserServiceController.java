package com.rest.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
    @GetMapping("/say")
    public String home(){
        return "Hello From Eureka Client";
    }
}
