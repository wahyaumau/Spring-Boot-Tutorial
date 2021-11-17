package com.nti.nbi.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMainApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootMainApp.class);
        UserService userService = context.getBean("userService", UserService.class);
        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        System.out.println((userService.getUserRepository() == userRepository)? "repository same": "not same");
    }
}
