package com.nti.nbi.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    static void applicationContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserRepositoryConfiguration.class);
        UserRepository repo1 = context.getBean("userRepository", UserRepository.class);
        UserRepository repo2 = context.getBean("userRepository", UserRepository.class);
        System.out.println((repo1 == repo2) ? "Same": "Not Same");
    }
    static void dependencyInjection(){
        ApplicationContext context = new AnnotationConfigApplicationContext(UserServiceConfiguration.class);
        UserService userService = context.getBean("userService", UserService.class);
        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        System.out.println((userService.getUserRepository() == userRepository)? "repository same": "not same");
    }
    static void manualDependency(){
        var userRepository = new UserRepository();
        var userService = new UserService(userRepository);
        System.out.println((userService.getUserRepository() == userRepository)? "repository same": "not same");
    }
    public static void main(String[] args) {
        applicationContext();
        manualDependency();
        dependencyInjection();
    }
}
