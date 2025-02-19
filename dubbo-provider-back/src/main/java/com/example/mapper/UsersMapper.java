package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    void insertXml(Users users);

    @Insert("insert into users(username, password, enabled) values (#{username}, #{password}, #{enabled})")
    void insertUsersByNode(Users users);
}
