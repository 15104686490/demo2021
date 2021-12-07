package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lzy
 * @create 2021/12/7 8:59
 */
@Getter
@Setter
@ToString
public class Reault<T> {
    private int code;
    private String message;
    private T data;
}
