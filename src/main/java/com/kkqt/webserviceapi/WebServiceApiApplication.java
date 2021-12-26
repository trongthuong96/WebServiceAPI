package com.kkqt.webserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class WebServiceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceApiApplication.class, args);
    }

}
