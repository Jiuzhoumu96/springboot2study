package com.lanhuigu.springboot2study.config;

import com.lanhuigu.springboot2study.interceptor.LoginInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Jiuzhoumu
 * @date 2021/9/21 19:20
 */

/**
 * 1、编写一个拦截器，实现HandlerInterceptor接口
 * 2、拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors）
 * 3、指定拦截器的拦截规则
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminWebConfig.class);
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") // 所有的请求都被拦截，包括静态资源
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**","/error"); // 放行的资源
    }
}
