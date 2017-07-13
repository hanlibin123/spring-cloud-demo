package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.impl.UserDaoImpl;
import com.example.demo.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/7/12.
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private EurekaClient discoveryClient;
    @GetMapping("/index/{id}")
    public User index(@PathVariable Integer id){
        System.out.println("spring-cloud-riddon");
        return userDao.findbyId(id);
    }

    @GetMapping("eureka-instance")
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("UNKNOWN", false);
        return instance.getHomePageUrl();
    }
}
