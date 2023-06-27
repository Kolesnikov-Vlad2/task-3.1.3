package ru.itmentor.spring.boot_security.demo.dao;
import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void removeUserById(long id);
    User getUserById(long id);
    Role getRoleById(long id);
    List<User> getUsers();
    List<Role> getRoles();
    void updateUser(long id, User updatedUser);
    User findByLogin(String login);
}