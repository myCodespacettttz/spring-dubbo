package com.example.controller;

import api.Test1Service;
import entity.Users;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rpc")
public class RPCController {

    @DubboReference(timeout = 50000)
    Test1Service test1Service;

    @GetMapping("/sendMessage1")
    public String sendMessage1() {
        return test1Service.test1();
    }

    @GetMapping("/sendMessage2")
    public String sendMessage2() {
        return test1Service.test2();
    }

    @PostMapping("/sendMessage3")
    public String sendMessage3(@RequestBody Users users) {
        return test1Service.test3(users);
    }

    @PostMapping("/loadBalance")
    public String loadBalance() {
        return test1Service.test4_loadBalance();
    }

    @PostMapping("/loadBalanceNum")
    public Integer loadBalanceNum() {
        return test1Service.test5_testLoadBalanceNum();
    }
}
