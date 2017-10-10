package com.cloud.frame.business.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.frame.business.service.HiServiceInterface;

@RestController
public class HiController {

    @Autowired
    HiServiceInterface hiServicIntfc;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return hiServicIntfc.sayHiFromClient(name);
    }
}
