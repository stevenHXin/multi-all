package com.steven.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String ribbonHi(String name) {
        return  restTemplate.getForObject("http://SERVICE-BOOT/index/" + name, String.class);
    }
}
