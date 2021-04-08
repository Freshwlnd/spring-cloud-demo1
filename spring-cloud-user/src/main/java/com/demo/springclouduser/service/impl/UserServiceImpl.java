package com.demo.springclouduser.service.impl;

import com.demo.springcloudcommon.obj.User;
import com.demo.springclouduser.mapper.IUserMapper;
import com.demo.springclouduser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserMapper iUserMapper;

    @Override
    public User findUserById(int id) { return iUserMapper.findUserById(id); }

    @Override
    public List<User> findUserByName(String userName) {
        return iUserMapper.findUserByName(userName);
    }

    @Override
    public List<User> findAllUsers() {
        return iUserMapper.findAllUsers();
    }

    @Override
    public int insertUser(User user) {
        return iUserMapper.insertUser(user);
    }
}
