package com.example.springbootsecuritybasicauthrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.springbootsecuritybasicauthrestapi")
@SpringBootApplication
public class SpringbootsecuritybasicauthrestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsecuritybasicauthrestapiApplication.class, args);
    }

}
