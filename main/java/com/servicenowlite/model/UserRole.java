package com.servicenowlite.model;

public class UserRole {
    private String sysId;
    private User user;
    private Role role;

    public User getUser() {
        return user;
    }

    public Role getRole() {
        return role;
    }
}
