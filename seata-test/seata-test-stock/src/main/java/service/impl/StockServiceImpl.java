package service.impl;

import api.StockApi;
import com.example.mapper.StockMapper;
import entity.Product;
import entity.Stock;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService
public class StockServiceImpl implements StockApi {

    @Autowired
    private StockMapper stockMapper;

    @Override
    public void setStock(List<Product> list, List<Integer> buyNumList) {
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            Integer buyNum = buyNumList.get(i);
            Stock stock = new Stock();
            stock.setCommodityCode(String.valueOf(product.getId()));
            stock.setCount(buyNum);
            stockMapper.updateStock(stock);
        }
    }
}
