package ru.mistin.crudJR.service;

import ru.mistin.crudJR.model.User;

import java.util.List;

/**
 * Created by chekuninalexey on 24.06.17.
 */
public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
    User getUserById(int id);
    List<User> listUsers();
}
