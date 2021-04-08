package com.demo.springcloudcommon.obj;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;

    @Column
    private Date nowDate;

    public User(String userName) {
        this.userName = userName;
        this.nowDate = new Date();
    }

    public User() {

    }
}
