package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Account;
import entity.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    Integer updateAccount(Account account);
}
