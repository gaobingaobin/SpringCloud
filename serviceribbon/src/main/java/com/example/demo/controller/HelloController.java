package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018-04-07.
 */
@RestController
@RequestMapping
public class HelloController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getInstanceInfo")
    public String getInstanceInfo() {
        return restTemplate.getForObject("http://SERVICE/eureka-instance",String.class);
    }
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {
        return restTemplate.getForObject("http://SERVICE/getUser/"+id,User.class);
    }
}
