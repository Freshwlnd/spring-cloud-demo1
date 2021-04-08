package com.demo.springclouduser.service;

import com.demo.springcloudcommon.obj.User;
import com.demo.springclouduser.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserMapper iUserMapper;

    @Override
    public User findUserByName(String name) {
        return iUserMapper.findUserByName(name);
    }

    @Override
    public List<User> findAllUsers() {
        return iUserMapper.findAllUsers();
    }

    @Override
    public int
}
