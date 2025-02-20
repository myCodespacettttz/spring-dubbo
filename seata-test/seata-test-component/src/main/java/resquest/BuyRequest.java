package resquest;

import entity.Product;

import java.io.Serializable;
import java.util.List;


public class BuyRequest implements Serializable {
    private static final long serialVersionUID = System.currentTimeMillis();
    List<Product> products;
    List<Integer> buyNumList;
    String userId;

    public BuyRequest() {
    }

    public BuyRequest(List<Product> products, List<Integer> buyNumList, String userId) {
        this.products = products;
        this.buyNumList = buyNumList;
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Integer> getBuyNumList() {
        return buyNumList;
    }

    public void setBuyNumList(List<Integer> buyNumList) {
        this.buyNumList = buyNumList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
