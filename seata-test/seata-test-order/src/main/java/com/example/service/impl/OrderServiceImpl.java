package com.example.service.impl;

import api.OrderApi;
import com.example.mapper.OrderMapper;
import entity.Order;
import entity.Product;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService
public class OrderServiceImpl implements OrderApi {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int createOrder(List<Product> list, Integer money, String userId) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            if (i != list.size() - 1) {
                temp.append(product.getProductName()).append(",");
            }
        }
        return orderMapper.insert(new Order(null, userId, temp.toString(), 1, money));
    }
}
