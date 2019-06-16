package com.steven.springboot.test;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getService(String name, String port) {
        return "Hello! My name is " + name + ". And I come from the port " + port;
    }
}
