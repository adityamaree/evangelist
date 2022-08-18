package com.fis.subscriptionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.subscriptionservice.entity.Subscription;
import com.fis.subscriptionservice.service.SubscriptionService;

@RestController
public class SubscriptionController {

	@Autowired
	private SubscriptionService service;
	
	@GetMapping("/subscription")
	public List<Subscription> getSubscriptions(){
		return null;
		
	}
}
