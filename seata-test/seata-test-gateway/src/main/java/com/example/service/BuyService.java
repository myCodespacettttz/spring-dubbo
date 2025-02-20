package com.example.service;

import entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BuyService {

    public String buy(List<Product> list, List<Integer> buyNumList, String userId);
}
