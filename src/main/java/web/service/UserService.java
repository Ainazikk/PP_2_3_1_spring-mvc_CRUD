package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void save(User user);
    void remove(int id);
    User update(User user);
    User show_user(int id);
}
