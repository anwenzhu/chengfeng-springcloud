package com.chengfeng.servicefeign.controller;

import com.chengfeng.servicefeign.client.SchedualServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedualController {

    @Autowired
    SchedualServiceClient schedualServiceClient;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
       return schedualServiceClient.sayHello(name);
    }
}
