package com.xb.service.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;


/**
 * @ClassName: XBActiveMQAplication
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.07.23 1:04
 */
@SpringBootApplication
@EnableJms
public class XBActiveMQApplication {
    @Bean
    public Queue queue(){
        ActiveMQQueue queue = new ActiveMQQueue("common.queue");
        return queue;
    }

    @Bean
    public Topic topic(){
        return new ActiveMQTopic("video.topic");
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }

    public static void main(String[] args) {
        SpringApplication.run(XBActiveMQApplication.class,args);
    }
}
