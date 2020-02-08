package com.lemonfish.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Masics 张超
 * @date 2020/2/3 15:04
 */
// 变成配置类
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("main");
    }
/*    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Log()).addPathPatterns("/**").
                excludePathPatterns("/", "/user/login", "/login.html","/css/**","/js/**","/img/**");
    }*/
}
