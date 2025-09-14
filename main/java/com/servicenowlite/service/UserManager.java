package com.servicenowlite.service;

import com.servicenowlite.model.User;

import java.util.Map;

public class UserManager {
    Map<String, User> users;

    public UserManager(Map<String, User> users) {
        this.users = users;
    }

    public void addUser(String sysId, String name, String email){

        this.users.put(sysId, new User(name, email));
    }
    public User getUser(String sysId){
        return this.users.get(sysId);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void deleteUser(String sysId){
        this.users.remove(sysId);
    }

}
