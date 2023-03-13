package com.example.conc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserManager {

     private List<User> users;

    public UserManager() {
        this.users=new ArrayList<>();

        users.add(new User("john","password123", Arrays.asList("customer","admin")));
        users.add(new User("jane", "secret456", Arrays.asList("customer", "admin")));

    }

    public User getUser(String username)
    {
        for (User user:users)
        {
            if(user.getUsername().equals(username)){
                return  user;
            }
        }
        return  null;
    }
}
