package com.example;

import java.util.PrimitiveIterator;

public class UserController {

    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }
    public void setFirstName(String firstName) {
        model.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        model.setLastName(lastName);
    }

    public void setEmail(String email) {
        model.setEmail(email);
    }

    public String getFirstName() {
        return model.getFirstName();
    }

    public String getLastName() {
        return model.getLastName();
    }

    public String getEmail() {
        return model.getEmail();
    }

    public void updateUserView() {
        view.printUserDetails(model.getFirstName(), model.getLastName(), model.getEmail());
    }

    public void updateUserModel(User user) {
        model.setFirstName(user.getFirstName());
        model.setLastName(user.getLastName());
        model.setEmail(user.getEmail());
    }

}
