package com.example.abst;

import com.example.conc.User;

import java.util.List;

public interface UserRepository {

    void save(User user);
    User findById(int id);

    List<User> findAll();

    void update(User user);

    void delete(User user);
}
