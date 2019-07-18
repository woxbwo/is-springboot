package com.xb.service.base;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.StopWatch;

//@SpringBootApplication //一个注解顶下面3个
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
@ServletComponentScan
public class XBBaseApplication {

	public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
		SpringApplication.run(XBBaseApplication.class, args);
		stopWatch.stop();
        System.out.println("-----------------------:"+stopWatch.getTotalTimeSeconds());
	}
	

	@Bean  
    public MultipartConfigElement multipartConfigElement() {  
        MultipartConfigFactory factory = new MultipartConfigFactory();  
        //单个文件最大  
        factory.setMaxFileSize("10240KB"); //KB,MB  
        /// 设置总上传数据总大小  
        factory.setMaxRequestSize("1024000KB");  
        return factory.createMultipartConfig();  
    }  
	
	
	
}
