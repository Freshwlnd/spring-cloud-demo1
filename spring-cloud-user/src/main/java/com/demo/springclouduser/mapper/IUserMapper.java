package com.demo.springclouduser.mapper;

import com.demo.springcloudcommon.obj.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface IUserMapper {

    @Select("select * from user where id = #{id}")
    User findUserById(int id);

    @Select("select * from user where userName = #{userName}")
    List<User> findUserByName(String userName);

    @Select("select * from user")
    List<User> findAllUsers();

    @Insert("INSERT INTO user(userName, nowDate) VALUES(#{userName}, #{nowDate})")
    int insertUser(User user);
}
