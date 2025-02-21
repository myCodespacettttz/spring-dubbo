package com.example.service.impl;

import api.AccountApi;
import api.OrderApi;
import api.StockApi;
import com.example.service.BuyService;
import entity.Product;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyServiceImpl implements BuyService {

    @DubboReference(timeout = 500000)
    private AccountApi accountApi;

    @DubboReference(timeout = 500000)
    private OrderApi orderApi;

    @DubboReference(timeout = 500000)
    private StockApi setStock;

    @Override
    public String buy(List<Product> list, List<Integer> buyNumList, String userId) {
        Integer accountMoney = 0;
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            Integer num = buyNumList.get(i);
            accountMoney += product.money * num;
        }
        int orderLine = orderApi.createOrder(list, accountMoney, userId);
        int stockLine = setStock.setStock(list, buyNumList);
        int accountLine = accountApi.setUserMoney(accountMoney, userId);
        if (orderLine == 1 && stockLine == list.size() && accountLine == 1) return "success";
        return "error";
    }
}
