package com.example.serivce.impl;

import api.AccountApi;
import com.example.mapper.AccountMapper;
import entity.Account;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class AccountServiceImpl implements AccountApi {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Integer setUserMoney(Integer money, String userId) {
        Account account = new Account();
        account.setMoney(money);
        account.setUserId(userId);
        return accountMapper.updateAccount(account);
    }
}
