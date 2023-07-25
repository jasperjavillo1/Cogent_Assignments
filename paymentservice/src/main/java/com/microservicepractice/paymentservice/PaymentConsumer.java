package com.microservicepractice.paymentservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class PaymentConsumer {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private DataRepository drepo;
	@KafkaListener(topics="orders",groupId="myGroup")
	public void Listener(float order)
	{
		logger.info(String.format("Order Recieved" + order));
		Order o = new Order();
		o.setPayment(order);
		o.setPrice(25.0f);
		if(o.getPayment()>=o.getPrice())
		{
			drepo.save(o);
			logger.info(String.format("Order Logged"));
		}
		else
		{
			logger.info(String.format("Payement Insufficent"));
		}
	}
}
