package com.example.controller;

import com.example.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import resquest.BuyRequest;

@RestController
@RequestMapping("/buy")
public class BuyController {

    @Autowired
    private BuyService buyService;

    @PostMapping("/buyProduct")
    public String buyProduct(@RequestBody BuyRequest temp) {
        return buyService.buy(temp.getProducts(), temp.getBuyNumList(), temp.getUserId());
    }
}
