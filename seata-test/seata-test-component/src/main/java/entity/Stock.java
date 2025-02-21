package entity;



import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("stock_tbl")
public class Stock implements Serializable {
    private static final long serialVersionUID = System.currentTimeMillis();
    public Integer id;
    public String commodityCode;
    public Integer count;

    public Stock() {
    }

    public Stock(Integer id, String commodityCode, Integer count) {
        this.id = id;
        this.commodityCode = commodityCode;
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
