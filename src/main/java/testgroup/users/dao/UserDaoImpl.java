package testgroup.users.dao;

import org.springframework.stereotype.Component;
import testgroup.users.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class UserDaoImpl implements UserDao {

    private static int USER_COUNT = 0;

    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(USER_COUNT++, "John Doe", "john@doe.com"));
        users.add(new User(USER_COUNT++, "John", "Connor"));
    }

    @Override
    public void addUser(User user) {
        user.setId(USER_COUNT++);
        users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

}
