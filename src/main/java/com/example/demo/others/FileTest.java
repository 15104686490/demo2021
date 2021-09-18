package com.example.demo.others;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("D:\\offlinemaps");
        listAllFiles(file);
    }
    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }
}
