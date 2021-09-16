package com.example.demo.dao;

import com.example.demo.model.PoolData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PoolDataDao {

    @Select("select id,pool_name,value,pool_value,time_stamp from pool_demo")
    public List<PoolData> queryAllData();
}
