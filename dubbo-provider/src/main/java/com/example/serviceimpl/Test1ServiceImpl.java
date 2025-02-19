package com.example.serviceimpl;

import api.Test1Service;
import entity.Users;
import com.example.mapper.RolesMapper;
import com.example.mapper.UsersMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

@DubboService
public class Test1ServiceImpl implements Test1Service {

    private AtomicInteger atomicInteger = new AtomicInteger();

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private RolesMapper rolesMapper;

    @Override
    public String test1() {
        return "I Get Message From Dubbo Service";
    }

    @Override
    public String test2() {
        System.out.println("test mybatis plus insert-----------");
        usersMapper.insert(new Users("xiaoming", "123456", 1));
        System.out.println("test xml insert-----------");
        usersMapper.insertXml(new Users("xiaohong", "123456", 2));
        System.out.println("test node insert-----------");
        usersMapper.insertUsersByNode(new Users("xiaobai", "123456", 3));
        return "insert all success";
    }

    @Override
    public String test3(Users users) {
        usersMapper.insert(users);
        return "rpc send entity success";
    }

    @Override
    public String test4_loadBalance() {
        atomicInteger.incrementAndGet();
        return "I am dubbo provider";
    }

    @Override
    public Integer test5_testLoadBalanceNum() {
        return atomicInteger.get();
    }
}
