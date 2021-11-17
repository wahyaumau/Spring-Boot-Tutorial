package com.nti.nbi.springwebjpa;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/hello-post")
    public String helloPost(){
        return "hello post";
    }
}
