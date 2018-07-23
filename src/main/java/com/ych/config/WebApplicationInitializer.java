package com.ych.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * 配置DispetcherServlet
 */

/**
 * 这个抽象类的继承会同时创建Spring应用上下文和Servlet的应用上下文。
 * 其中Spring上下文的创建是是通过ContextLoaderListener监听Tomcat容器初始化来创建的，其中配置了SpringMVC组件之外的bean和依赖
 * 在此继承中通过读取RootConfig初始化Spring上下文
 * DispatcherServlet是初始化SpringMVC相关的组件，通过读取配WebConfig的配置来完成。
 * 在Servlet容器初始化的时候需要读取父容器Spring上下问的bean和依赖关系
 */public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //获得ContextLoaderListener应用上下文的bean
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    //获得DispatcherServlet应用上下文的bean,会根据配置内容自动扫描组件，然后创建相关的bean
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 该方法将过滤器添加到DispatcherServlet中
     * @return 返回过滤器列表
     */
    @Override
    protected Filter[] getServletFilters() {
        return super.getServletFilters();
    }
}
