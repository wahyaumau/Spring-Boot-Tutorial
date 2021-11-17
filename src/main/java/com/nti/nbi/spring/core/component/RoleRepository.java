package com.nti.nbi.spring.core.component;

import org.springframework.stereotype.Component;

@Component("roleRepository")
public class RoleRepository {
    public RoleRepository(){
        System.out.println("Creating Role");
    }
}
