package com.demo.springcloudorder.controller;

import com.demo.springcloudapi.User.UserClient;
import com.demo.springcloudcommon.obj.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
@ComponentScan(basePackages = "com.demo.springclouduser.controller.UserController")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){

        InstanceInfo instanceInfo=eurekaClient.getNextServerFromEureka("SPRING-BOOT-USER",false);
        String userUrl=instanceInfo.getHomePageUrl();
        return  restTemplate.getForObject(userUrl+"user/"+id,User.class);

//        return  restTemplate.getForObject("http://localhost:8081/user/"+id,User.class);
    }

    @GetMapping("/list")
    public List info() {
        return userClient.list();
    }

}
