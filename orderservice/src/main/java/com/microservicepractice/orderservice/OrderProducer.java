package com.microservicepractice.orderservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	private KafkaTemplate<String,Float> kafkaTemplate;
	public OrderProducer(KafkaTemplate<String,Float> kafkaTemplate)
	{
		this.kafkaTemplate = kafkaTemplate;
	}
	public void SendMessage(float order)
	{
		logger.info(String.valueOf(order));
		kafkaTemplate.send("orders", order);
	}
}
