package com.nti.nbi.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        UserRepositoryConfiguration.class
})
public class UserServiceConfiguration {
    @Bean(name = "userService")
    public UserService userService(@Qualifier("userRepository") UserRepository userRepository){
        return new UserService(userRepository);
    }
}
