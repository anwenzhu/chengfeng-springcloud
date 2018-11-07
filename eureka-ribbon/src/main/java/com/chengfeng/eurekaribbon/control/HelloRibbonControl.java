package com.chengfeng.eurekaribbon.control;

import com.chengfeng.eurekaribbon.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRibbonControl {

    @Autowired
    private HelloRibbonService helloRibbonService;

    @GetMapping("/hi")
    public String viewService(@RequestParam String name) {
        return helloRibbonService.viewService(name);
    }
}
