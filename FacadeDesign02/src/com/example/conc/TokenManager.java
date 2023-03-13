package com.example.conc;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenManager {

    private Map<String,User> tokens;

    public TokenManager() {
        this.tokens=new HashMap<>();
    }

    public  String generateToken(User user)
    {
        String token= UUID.randomUUID().toString();
        tokens.put(token,user);
        return  token;
    }

    public  User getUser(String token){
        return  tokens.get(token);
    }
}
