package com.example.demo.service;

import com.example.demo.dao.PoolDataDao;
import com.example.demo.model.PoolData;
import lombok.extern.slf4j.Slf4j;
//import org.apache.tomcat.jni.Pool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Slf4j
@Service
public class PoolDataService {

    @Autowired
    PoolDataDao poolDataDao;

    public List<PoolData> queryAllPoolData() {
        List<PoolData> result = poolDataDao.queryAllData();
        return result;
    }

    public boolean insertPoolData() {
        try {
            for (int i = 0; i < 10; i++) {
                PoolData poolData = new PoolData();
                int value = new Random().nextInt(1000);
                poolData.setPool_name("pool" + value);
                poolData.setValue(value);
                poolData.setPool_value(value);
                poolDataDao.insertPoolData(poolData);
            }
            return true;
        } catch (Exception e) {
            //e.printStackTrace();
            log.error("some errors when insert pool data : " + e.toString());
            return false;
        }
    }
}
