package com.nti.nbi.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserRepositoryConfiguration {
    @Bean(name = "userRepository")
    public UserRepository userRepository(){
        return new UserRepository();
    }
}
