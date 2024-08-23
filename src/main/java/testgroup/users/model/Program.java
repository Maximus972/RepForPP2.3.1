package testgroup.users.model;

import testgroup.users.dao.UserDao;
import testgroup.users.dao.UserDaoImpl;

public class Program {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println(userDao.getUsers());
    }
}
