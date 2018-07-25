package com.ych.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//该注解已经被销毁
@EnableWebMvcSecurity
public class WebMvcSecurity extends WebSecurityConfigurerAdapter {
}
