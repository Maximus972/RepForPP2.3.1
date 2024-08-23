package testgroup.users.dao;

import testgroup.users.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getUsers();
}
