package com.example.demo.others;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ResourceTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("");
        try {
            InputStream inputStream = resource.getInputStream();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
}
