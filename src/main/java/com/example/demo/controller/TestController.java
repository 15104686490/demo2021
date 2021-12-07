package com.example.demo.controller;

import com.example.demo.model.PoolData;
import com.example.demo.service.PoolDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*测试接口*/
@Slf4j
@RestController
@Api(value = "后端查询Api")
@RequestMapping("/test")
public class TestController {

    @Autowired
    PoolDataService poolDataService;

    @ApiOperation(value = "POST请求测试", notes = "POST请求测试")
    @PostMapping("/postMethod")
    public String testPostMothod() {
        log.error("test post method...");
        return "ok!!";
    }

    @ApiOperation(value = "GET请求测试", notes = "GET请求测试")
    @GetMapping("/getMethod")
    public String testGetMethod() {
        log.error("test get method...");
        return "ok!!";
    }

    /*数据查询测试接口*/
    @CrossOrigin
    @ApiOperation(value = "数据查询测试", notes = "数据查询测试")
    @GetMapping("/queryDataTest")
    public List<PoolData> queryDataTest() {
        try {
            List<PoolData> poolData = poolDataService.queryAllPoolData();
            log.error("pool data size : " + poolData.size());
            return poolData;
        } catch (Exception e) {
            log.error("some errors when select pool data from db");
            log.error(e.toString());
            return null;
            //e.printStackTrace();
        }
    }

    /*数据插入测试接口*/
    @ApiOperation(value = "数据插入测试", notes = "数据插入测试")
    @GetMapping("/insertDataTest")
    public boolean insertDataTest() {
        try {
            poolDataService.insertPoolData();
            return true;
        } catch (Exception e) {
            //e.printStackTrace();
            log.error("some errors when insert data to db");
            log.error(e.toString());
            return false;
        }
    }
}
