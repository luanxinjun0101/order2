package com.huaweiair.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T05:59:18.244Z")

@RpcSchema(schemaId = "order")
public class OrderImpl implements Order{

    @Autowired
    private OrderDelegate orderDelegate;


    public String helloworld(String name) {

        return orderDelegate.helloworld(name);
    }

}
