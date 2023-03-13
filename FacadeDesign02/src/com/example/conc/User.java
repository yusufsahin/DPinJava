package com.example.conc;

import java.util.List;

public class User {
    private  String username;
    private  String password;
    private List<String> roles;

    public User(String username, String password, List<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getRoles() {
        return roles;
    }
    public boolean hasAccess(String resource) {
        for (String role : roles) {
            if (role.equals("admin") || resource.startsWith("/" + role)) {
                return true;
            }
        }
        return false;
    }


}
