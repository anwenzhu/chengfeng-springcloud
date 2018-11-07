package com.chengfeng.servicefeign.client;

import com.chengfeng.servicefeign.client.fallback.SchedualServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client",fallback = SchedualServiceHystric.class)
public interface SchedualServiceClient {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
