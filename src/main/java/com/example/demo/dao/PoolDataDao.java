package com.example.demo.dao;

import com.example.demo.model.PoolData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PoolDataDao {

    @Select("select id, pool_name, value, pool_value, time_stamp from pool_demo")
    public List<PoolData> queryAllData();

    @Insert("insert into pool_demo (pool_name, value, pool_value) values " +
            "(#{poolData.pool_name},#{poolData.value},#{poolData.pool_value})\n")
    public void insertPoolData(@Param("poolData") PoolData poolData);
}
