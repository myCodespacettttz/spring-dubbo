package api;

import entity.Product;

import java.util.List;

public interface StockApi {
    public void setStock(List<Product> list, List<Integer> buyNumList);
}
