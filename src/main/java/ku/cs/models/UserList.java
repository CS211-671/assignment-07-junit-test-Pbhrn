package ku.cs.models;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.isUsername(username)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String username, String password) {
        User exist = findUserByUsername(username);
        if (exist == null) {
            users.add(new User(username, password));
        }
    }

    public boolean changePassword(String username, String oldPassword, String newPassword) {
        User user = findUserByUsername(username);
        if (user != null && user.isPasswordCorrect(oldPassword)) {
            user.setPassword(newPassword);
            return true;
        }
        return false;
    }

    public User login(String username, String password) {
        User user = findUserByUsername(username);
        if (user != null && user.isPasswordCorrect(password)) {
            return user;
        }
        return null;
    }

    public Student findUser(String username) {
        for (User user : users) {
        }
        return null;
    }

    public boolean changePassword(Object userOrUsername, String newPassword) {
        User user = null;
        if (userOrUsername instanceof String) {
            user = findUserByUsername((String) userOrUsername);
        } else if (userOrUsername instanceof User) {
            user = (User) userOrUsername;
        }

        if (user != null) {
            user.setPassword(newPassword);
            return true;
        }
        return false;
    }

    public void addUser(User student) {
        User exist = findUserByUsername(student.getUsername());
        if (exist == null) {
            users.add(student);
        }
    }
}
