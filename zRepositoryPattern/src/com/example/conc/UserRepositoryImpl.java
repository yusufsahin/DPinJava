package com.example.conc;

import com.example.abst.UserRepository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private Connection connection;



    public UserRepositoryImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/myDb", "postgres", "TestPassword1234");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO public.user (name, email) VALUES (?,?)");
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public User findById(int id) {
        try  {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM public.user WHERE id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try  {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM public.user");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                users.add(new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;

    }

    @Override
    public void update(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE public.user SET name = ?, email = ? WHERE id = ?");
        statement.setString(1, user.getName());
        statement.setString(2, user.getEmail());
        statement.setInt(3, user.getId());
        statement.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    }

    @Override
    public void delete(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM public.user WHERE id = ?");
            statement.setInt(1, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}

