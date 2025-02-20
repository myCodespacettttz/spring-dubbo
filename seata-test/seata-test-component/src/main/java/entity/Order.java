package entity;




import java.io.Serializable;


public class Order implements Serializable {
    private static final long serialVersionUID = System.currentTimeMillis();
    public Integer id;
    public String userId;
    public String commodityCode;
    public Integer count;
    public Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Order() {
    }

    public Order(Integer id, String userId, String commodityCode, Integer count, Integer money) {
        this.id = id;
        this.userId = userId;
        this.commodityCode = commodityCode;
        this.count = count;
        this.money = money;
    }
}
