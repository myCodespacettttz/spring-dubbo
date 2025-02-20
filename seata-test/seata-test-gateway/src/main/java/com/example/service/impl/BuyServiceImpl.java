package com.example.service.impl;

import api.AccountApi;
import api.OrderApi;
import api.StockApi;
import com.example.service.BuyService;
import entity.Product;
import org.apache.dubbo.config.annotation.DubboReference;

import java.util.List;

public class BuyServiceImpl implements BuyService {

    @DubboReference
    private AccountApi accountApi;

    @DubboReference
    private OrderApi orderApi;

    @DubboReference
    private StockApi setStock;

    @Override
    public String buy(List<Product> list, List<Integer> buyNumList, String userId) {
        Integer accountMoney = 0;
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            Integer num = buyNumList.get(i);
            accountMoney += product.money * num;
        }
        orderApi.createOrder(list, accountMoney, userId);
        setStock.setStock(list, buyNumList);
        accountApi.setUserMoney(accountMoney, userId);
        return "success";
    }
}
