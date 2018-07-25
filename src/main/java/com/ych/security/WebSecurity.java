package com.ych.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 为security的web注解类，本质上还是为配置类
 */
@Configuration
//重要注解，自动开启web安全性
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
}
