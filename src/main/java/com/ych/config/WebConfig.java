package com.ych.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//启用SpringMVC的Config配置，返回的是DispatcherServlet的需要的bean
//@Configuration
////表示启用SpringMVC配置
//@EnableWebMvc
////会将组件全部扫描，类似于Spring的ApplicationContext配置
//@ComponentScan("com.ych.*")
public class WebConfig extends WebMvcConfigurerAdapter {

    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //解析的url前置路径，默认从webapp目录开始查找
        viewResolver.setPrefix("/WEB-INF/views/");
        //解析的后置路径
        viewResolver.setSuffix(".jsp");
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }

    //处理静态资源请求
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
