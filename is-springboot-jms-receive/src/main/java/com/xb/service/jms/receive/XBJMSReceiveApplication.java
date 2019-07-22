package com.xb.service.jms.receive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

/**
 * @ClassName: XBJMSReceiveApplication
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.07.23 1:57
 */
@SpringBootApplication
@EnableJms
public class XBJMSReceiveApplication {
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }
    public static void main(String[] args) {
        SpringApplication.run(XBJMSReceiveApplication.class,args);
    }
}
