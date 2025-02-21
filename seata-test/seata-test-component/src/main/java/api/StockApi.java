package api;

import entity.Product;

import java.util.List;

public interface StockApi {
    public int setStock(List<Product> list, List<Integer> buyNumList);
}
