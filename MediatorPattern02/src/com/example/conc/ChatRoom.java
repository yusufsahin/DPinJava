package com.example.conc;

import com.example.abst.ChatMediator;
import com.example.abst.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    private List<User> users;

    public ChatRoom() {
        this.users=new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
