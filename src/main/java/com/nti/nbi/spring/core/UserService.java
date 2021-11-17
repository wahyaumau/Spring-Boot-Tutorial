package com.nti.nbi.spring.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserService {
    private UserRepository userRepository;
}
