package com.nti.nbi.spring.core.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        RoleRepository repo = context.getBean("roleRepository", RoleRepository.class);
        RoleService roleService = context.getBean("roleService", RoleService.class);
        System.out.println((repo == roleService.getRoleRepository()));
    }
}
