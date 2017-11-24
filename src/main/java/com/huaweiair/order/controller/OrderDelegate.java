package com.huaweiair.order.controller;

import org.springframework.stereotype.Component;


@Component
public class OrderDelegate implements Order {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
