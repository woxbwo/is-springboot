package com.xb.service.jms.receive.consumer.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
	/**
	 *@description:
	 * 实时监听消费
	 *@params:  [text]
	 *@return:  void
	 **/
	@JmsListener(destination="order.queue")
	public void receiveQueue(String text){
		System.out.println("OrderConsumer收到的报文为:"+text);
	}
}
