package com.halo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaloDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaloDemoApplication.class, args);
        System.out.println("HaloDemoApplication START SUCCESS!");
    }

}
