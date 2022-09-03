package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {

//    void save (String name, Integer age, String email);
//
//    void save (User user);
//
//    void removeById (Long id);

    List<User> listUsers();



}
