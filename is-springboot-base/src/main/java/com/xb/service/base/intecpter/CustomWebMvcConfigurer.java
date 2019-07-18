package com.xb.service.base.intecpter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CustomWebMvcConfigurer  implements WebMvcConfigurer{
    
	//增加拦截器
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginIntercepter())    //指定拦截器类
                .addPathPatterns("/Handles");        //指定该类拦截的url
        //.excludePathPatterns(); 忽略拦截路径
        WebMvcConfigurer.super.addInterceptors(registry); //继续往下走
    }
	


}
