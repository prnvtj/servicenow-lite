package com.servicenowlite.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String sysId;
    private String name;
    private String email;
    private String userId;
    private List<Role> roles;

    public User(String name, String email){
        this.name = name;
        this.sysId = UUID.randomUUID().toString().replace("-", "");
        this.email = email;
        this.roles = new ArrayList<>();
    }

    public String getSysId() {
        return sysId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
