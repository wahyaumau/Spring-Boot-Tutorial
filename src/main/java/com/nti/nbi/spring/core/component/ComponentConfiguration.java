package com.nti.nbi.spring.core.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.nti.nbi.spring.core.component"
})
public class ComponentConfiguration {
}
