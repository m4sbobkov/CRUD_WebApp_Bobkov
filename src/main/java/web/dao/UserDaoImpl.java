package web.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<User> listUsers() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from User", User.class).getResultList();
    }

}
