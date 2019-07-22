package com.xb.service.activemq.service.impl;

import com.xb.service.activemq.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;


/**
 * @ClassName: ProducerService
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.07.23 1:30
 */
@Service
public class ProducerService implements IProducerService {
    @Autowired
    private JmsMessagingTemplate template;
    @Autowired
    private Queue queue;

    @Override
    public void sendMessage(Destination destination, String message) {
        template.convertAndSend(destination,message);
    }

    @Override
    public void sendMessage(String message) {
        template.convertAndSend(this.queue,message);
    }

    //=======发布订阅相关代码=========

    @Autowired
    private Topic topic;


    @Override
    public void publish(String msg) {
        this.template.convertAndSend(this.topic, msg);
    }
}
