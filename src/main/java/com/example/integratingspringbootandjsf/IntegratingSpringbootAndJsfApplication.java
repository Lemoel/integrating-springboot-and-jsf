package com.example.integratingspringbootandjsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IntegratingSpringbootAndJsfApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(IntegratingSpringbootAndJsfApplication.class, args);
    }

}
