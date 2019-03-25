package com.ych.config;

import com.ych.dao.SpittleDao;
import com.ych.dao.SpittleDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration
//@ComponentScan(basePackages = {"com.ych"},
//    excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
//    })
public class RootConfig {
    @Bean
    public SpittleDao spittleDao(){
        return new SpittleDaoImpl();
    }
}
