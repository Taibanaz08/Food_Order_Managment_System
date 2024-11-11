package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	 @Autowired
	    private OrderRepository orderRepository;

	    public Order saveOrder(Order order) {
	        return orderRepository.save(order);
	    }

	    public List<Order> getUserOrders(Long userId) {
	        return orderRepository.findByUserId(userId);
	    }

}
