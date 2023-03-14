package com.example.conc;

import com.example.abst.ChatMediator;
import com.example.abst.User;

public class ChatUser implements User {

    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        this.chatMediator.sendMessage(message, this);

    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}
