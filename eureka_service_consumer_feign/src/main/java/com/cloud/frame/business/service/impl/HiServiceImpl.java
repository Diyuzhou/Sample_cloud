package com.cloud.frame.business.service.impl;

import org.springframework.stereotype.Component;

import com.cloud.frame.business.service.HiServiceInterface;

@Component
public class HiServiceImpl implements HiServiceInterface {

	@Override
	public String sayHiFromClient(String name) {
		return "sorry "+name;
	}
}