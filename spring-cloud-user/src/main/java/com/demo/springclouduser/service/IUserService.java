package com.demo.springclouduser.service;

import com.demo.springcloudcommon.obj.User;

import java.util.List;

public interface IUserService {

    User findUserById(int id);

    List<User> findUserByName(String userName);

    List<User> findAllUsers();

    int insertUser(User user);
}
