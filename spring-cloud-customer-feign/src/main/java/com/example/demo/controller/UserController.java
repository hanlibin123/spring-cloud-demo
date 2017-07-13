package com.example.demo.controller;

import com.example.demo.feign.ProvideCustomerFeignClient;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2017/7/12.
 */
@RestController
public class UserController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private ProvideCustomerFeignClient feignClient;
    @GetMapping("index/{id}")
    public User findAll(@PathVariable Integer id){
        return feignClient.index(id);
    }

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("test-provide");
        System.out.println("111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort());
        ServiceInstance serviceInstance2 = this.loadBalancerClient.choose("test-provide2");
        System.out.println("222" + ":" + serviceInstance2.getServiceId() + ":" + serviceInstance2.getHost() + ":" + serviceInstance2.getPort());
        return "1";
    }
}
