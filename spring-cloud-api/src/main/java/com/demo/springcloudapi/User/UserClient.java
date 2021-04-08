package com.demo.springcloudapi.User;

import com.demo.springcloudcommon.obj.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
@FeignClient(name = "spring-boot-user")
public interface UserClient {
    @GetMapping("/user/list")
    List<User> list();
}
