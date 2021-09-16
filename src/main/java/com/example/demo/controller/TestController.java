package com.example.demo.controller;

import com.example.demo.model.PoolData;
import com.example.demo.service.PoolDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    PoolDataService poolDataService;

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

    @GetMapping("/queryDataTest")
    public List<PoolData> queryDataTest() {
        try {
            List<PoolData> poolData = poolDataService.queryAllPoolData();
            log.error("pool data size : " + poolData.size());
            return poolData;
        } catch (Exception e) {
            log.error("some errors when inset data to db");
            log.error(e.toString());
            return null;
            //e.printStackTrace();
        }
    }

    @GetMapping("/insertDataTest")
    public boolean insertDataTest() {
        try {
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
