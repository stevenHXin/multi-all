package com.steven.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Value("${server.port}")
    String port;

    @GetMapping("/index/{name}")
    public String index(@PathVariable("name") String name) {
        return helloService.getService(name, port);
    }
}
