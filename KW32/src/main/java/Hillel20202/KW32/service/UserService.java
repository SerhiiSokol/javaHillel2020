package Hillel20202.KW32.service;

import Hillel20202.KW32.model.User;


import java.util.List;

public interface UserService  {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    boolean deleteUser(Long id);
}
