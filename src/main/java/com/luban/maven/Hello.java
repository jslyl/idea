package com.luban.maven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Hello {
    public String sayHello(String name){
        return "Hello"+name;
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.shutdown();
        System.out.println(service.isTerminated());
//        try {
//            TimeUnit.SECONDS.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(service);
//        System.out.println(service.isShutdown());
//        service.execute(()->{
//            try {
//                TimeUnit.MICROSECONDS.sleep(500);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName());
//        });
//        System.out.println(service);
    }
}
