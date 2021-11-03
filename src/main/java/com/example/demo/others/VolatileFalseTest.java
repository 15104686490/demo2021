package com.example.demo.others;

public class VolatileFalseTest {
    static volatile int i = 0;
    static Object object = new Object();

    public static class PlusTask implements Runnable {

        @Override
        public void run() {
            synchronized (object) {
                for (int k = 0; k < 10000; k++) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("tg1");
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new PlusTask());
            threads[i].start();
            // threads[i].setPriority(1);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }
        System.out.println(i);
    }
}
