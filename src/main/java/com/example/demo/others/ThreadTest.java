package com.example.demo.others;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName() + " " + this.getId());
                System.out.println("start to work");
            }
        };
        thread.start();
    }
}
