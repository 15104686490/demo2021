package com.example.demo.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j

public class TestApiImpl implements  TestApi{
    @Override
    public String SayHello(String hello) {
        log.error("Test Api String : " + hello);
        return hello;
    }
}
