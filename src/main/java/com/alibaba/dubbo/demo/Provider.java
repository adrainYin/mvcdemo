package com.alibaba.dubbo.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Provider {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext(
                "file:/Users/yinchenhao/IdeaProjects/mvcdemo/src/config/provider.xml");
        applicationContext.start();
    }
}
