package mvc.crudNoBoot.dao;

import mvc.crudNoBoot.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDaoImpl implements UserDao{
//    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mvc.crudNoBoot.dao");
//    public static EntityManager getEntityManager() {
//        return emf.createEntityManager();
//    }


    private SessionFactory sessionFactory;
    // private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    // private static Map<Integer, User> users = new HashMap<>();

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public void add(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void edit(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public User getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }
}

//    @Override
//    @SuppressWarnings("unchecked")
//    public List<User> allUsers() {
//        return em.createQuery("from User").getResultList();
//    }
//    @Transactional
//    @Override
//    public void add(User user) {
//        em.getTransaction().begin();
//        em.persist(user);
//        em.getTransaction().commit();
//    }
//    @Transactional
//    @Override
//    public void delete(User user) {
//        em.getTransaction().begin();
//        em.remove(user);
//        em.getTransaction().commit();
//    }
//    @Transactional
//    @Override
//    public void edit(User user) {
//        em.getTransaction().begin();
//        em.merge(user);
//        em.getTransaction().commit();
//    }
//    @Transactional
//    @Override
//    public User getById(int id) {
//        return em.find(User.class, id);
//
//    }
