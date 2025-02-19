package entity;

public class Roles {
    public String role;
    public String resource;
    public String action;

    public Roles() {
    }

    public Roles(String role, String resource, String action) {
        this.role = role;
        this.resource = resource;
        this.action = action;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
