package com.servicenowlite.model;

import java.util.UUID;

public class Role {
    private String sysId;
    private String roleId;
    private String roleName;

    public Role(String roleName) {
        this.sysId = UUID.randomUUID().toString().replace("-", "");
        this.roleName = roleName;
    }
}
