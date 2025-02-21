package entity;



import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("account_tbl")
public class Account implements Serializable {
    private static final long serialVersionUID = System.currentTimeMillis();
    public Integer id;
    public String userId;
    public Integer money;

    public Account() {
    }

    public Account(Integer id, String userId, Integer money) {
        this.id = id;
        this.userId = userId;
        this.money = money;
    }

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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
