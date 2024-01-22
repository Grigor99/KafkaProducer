package com.learnkafka.controller;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AsyncRun {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    protected Object run() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try{
            int [] arr = {1,2};
            System.out.println(arr[4]);

        }catch (Exception e){

        }

        return "hello";
    }
}
