package com.cloud.frame.business.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloud.frame.business.service.impl.HiServiceImpl;

//feign hystrix
@FeignClient(value = "service-hi-1",fallback = HiServiceImpl.class)
public interface HiServiceInterface {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);
}