package com.alibaba.dubbo.demo;

public class ServiceDemoImp implements ServiceDemo{
    @Override
    public String sayHello(String content) {
        return "hello  " + content;
    }


}
