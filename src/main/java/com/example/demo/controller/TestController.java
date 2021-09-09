package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/postMothod")
    public String testPostMothod() {
        log.error("test post method...");
        return "ok!!";
    }

    @GetMapping("/testMethod")
    public String testGetMethod() {
        log.error("test get method...");
        return "ok!!";
    }

}
