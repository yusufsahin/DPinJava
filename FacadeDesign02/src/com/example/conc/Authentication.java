package com.example.conc;

public class Authentication {

    private  UserManager userManager;
    private TokenManager tokenManager;

    public Authentication() {
        this.userManager=new UserManager();
        this.tokenManager= new TokenManager();
    }

    public  boolean authenticate(String username,String password)
    {
        User user =userManager.getUser(username);
        if(user!=null &user.getPassword().equals(password))
        {
            String token= tokenManager.generateToken(user);
            System.out.println("Authentication successful");
            System.out.println("Token "+token);
            return  true;
        }
        else {
            System.out.println("Authentication failed");
            return  false;
        }
    }

    public boolean isAuthorized(String token,String resource)
    {
        User user=tokenManager.getUser(token);

        if(user!=null && user.hasAccess(resource))
        {
            System.out.println("Authorization granted");
            return true;
        }
        else {
            System.out.println("Authorization denied");
            return false;
        }
    }
}
