package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PoolData {
    int id;
    String pool_name;
    int value;
    int pool_value;
    String time_stamp;
}
