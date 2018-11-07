package com.chengfeng.servicefeign.client.fallback;

import com.chengfeng.servicefeign.client.SchedualServiceClient;
import com.netflix.hystrix.Hystrix;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements SchedualServiceClient{

    @Override
    public String sayHello(String name) {
        return "sorry," + name;
    }
}
