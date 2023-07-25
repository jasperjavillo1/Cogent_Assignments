package com.microservicepractice.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class OrderController {
	private OrderProducer op;
	public OrderController(OrderProducer op)
	{
		this.op = op;
	}
	
	@GetMapping
	public String place(@RequestParam("payment") float order)
	{
		op.SendMessage(order);
		return "Order Placed";
	}
}
