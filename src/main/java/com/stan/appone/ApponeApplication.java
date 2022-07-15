package com.stan.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApponeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApponeApplication.class, args);
        applicationContext.getId();
    }

}
