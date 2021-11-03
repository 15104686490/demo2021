package com.example.demo.others;

public class JoinTest {
    public volatile static int i = 0;

    public static class AddThread extends Thread {
        @Override
        public void run() {
            for (i = 0; i < 10000000; i++) {

            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        AddThread at = new AddThread();
        at.start();
        //置顶时间参数 等待指定时间ms  后继续执行
        at.join(2);
        System.out.println(i);
    }
}
