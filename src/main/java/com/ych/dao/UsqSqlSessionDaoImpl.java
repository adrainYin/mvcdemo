package com.ych.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.aop.framework.adapter.DefaultAdvisorAdapterRegistry;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.annotation.Resource;

public class UsqSqlSessionDaoImpl implements UseSqlSessionDao{

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public void selectByUserId(String userId) {
        SqlSessionFactoryBean sqlSessionFactoryBean;
        FileSystemXmlApplicationContext fileSystemXmlApplicationContex;
        DefaultAdvisorAdapterRegistry defaultAdvisorAdapterRegistry;
        MethodBeforeAdviceInterceptor methodBeforeAdviceInterceptor;
    }
}
