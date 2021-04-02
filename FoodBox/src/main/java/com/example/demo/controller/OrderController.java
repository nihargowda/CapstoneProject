package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/orders")
	@CrossOrigin(origins ="http://localhost:4200")
	public Orders saveOrder(@RequestBody Orders order) {
		return service.saveOrder(order);
	}
	
	
	

}
