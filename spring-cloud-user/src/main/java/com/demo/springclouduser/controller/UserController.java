package com.demo.springclouduser.controller;

import com.demo.springcloudcommon.obj.User;
import com.demo.springclouduser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/id/{id}")
    public User getUser(@PathVariable int id) {
        return iUserService.findUserById(id);
    }

    @GetMapping("/name/{userName}")
    public List<User> getUser(@PathVariable String userName) {
        return iUserService.findUserByName(userName);
    }

    @GetMapping("/list")
    public List<User> list() {
        return iUserService.findAllUsers();
    }

    @GetMapping("/addUser/{userName}")
    public User addUser(@PathVariable String userName) {
        User user = new User(userName);
        int result = iUserService.insertUser(user);
        if (result > 0) {
            return user;
        }

        user.setId(0L);
        user.setUserName(null);
        user.setNowDate(new Date());
        return user;
    }
}
