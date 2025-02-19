package entity;


import java.io.Serializable;

public class Users implements Serializable {
    public String username;
    public String password;
    public Integer enabled;

    private static final long serialVersionUID = System.currentTimeMillis();

    public Users() {
    }

    public Users(String username, String password, Integer enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
