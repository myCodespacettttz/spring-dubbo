package api;

import entity.Product;

import java.util.List;

public interface OrderApi {
    public void createOrder(List<Product> list, Integer money, String userId);
}
