package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Test")
public class ServiceDueñoTest extends AbstractServiceDueño {
    public ServiceDueñoTest() {
        color = "blanco";
    }

}
