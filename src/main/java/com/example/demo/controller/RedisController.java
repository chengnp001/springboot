package com.example.demo.controller;

import com.example.demo.component.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chengnp
 */
@RestController
@RequestMapping(path = "/redis")
public class RedisController {

    @Autowired
    private RedisClient redisClient;

    @RequestMapping("/set")
    public String set(String key, String value) throws Exception{
        redisClient.set(key, value);
        return "success";
    }

    @RequestMapping("/get")
    public String get(String key) throws Exception {
        return redisClient.get(key);
    }
}
