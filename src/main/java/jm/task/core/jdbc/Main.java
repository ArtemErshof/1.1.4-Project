package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<User> userList;

    static {
        userList = new ArrayList<>();
        userList.add(new User("Serg", "Graevsky", (byte) 33));
        userList.add(new User("Artem", "Ershov", (byte) 37));
        userList.add(new User("Oksana", "Ershova", (byte) 34));
        userList.add(new User("Test", "Testov", (byte) 55));
    }

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        for (User user : userList) {
            userService.saveUser(user.getName(), user.getLastName(), user.getAge());
        }
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
