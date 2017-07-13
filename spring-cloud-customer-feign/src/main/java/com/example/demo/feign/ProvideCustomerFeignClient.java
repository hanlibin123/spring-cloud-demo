package com.example.demo.feign;

import com.example.demo.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2017/7/13.
 */
@FeignClient("test-provide")
public interface ProvideCustomerFeignClient {
    @RequestMapping(value = "index/{id}" ,method = RequestMethod.GET)
    public User index(@PathVariable("id") Integer id);
}
