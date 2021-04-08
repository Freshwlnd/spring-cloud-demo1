package com.demo.springcloudcommon.obj;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String id;
    private Date nowDate;

    public User(String id) {
        this.id = id;
        this.nowDate = new Date();
    }

    public User() {

    }
}