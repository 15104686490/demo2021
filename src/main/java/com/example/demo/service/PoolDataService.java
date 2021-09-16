package com.example.demo.service;

import com.example.demo.dao.PoolDataDao;
import com.example.demo.model.PoolData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoolDataService {

    @Autowired
    PoolDataDao poolDataDao;

    public List<PoolData> queryAllPoolData(){
        List<PoolData> result = poolDataDao.queryAllData();
        return result;
    }
}
