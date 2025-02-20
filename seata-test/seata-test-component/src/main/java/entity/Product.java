package entity;



import java.io.Serializable;


public class Product implements Serializable {
    private static final long serialVersionUID = System.currentTimeMillis();
    public Integer id;
    public String productName;
    public Integer money;

    public Product() {
    }

    public Product(Integer id, String productName, Integer money) {
        this.id = id;
        this.productName = productName;
        this.money = money;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
