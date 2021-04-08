package com.demo.springclouduser.controller;

import com.demo.springcloudcommon.obj.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return new User(id);
    }

    @GetMapping("/list")
    public List<User> list() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("1"));
        userList.add(new User("2"));
        return userList;
    }
}
