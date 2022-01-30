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
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDaoImpl implements UserDao{


    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager em;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers() {
        return em.createQuery("from User").getResultList();
    }

    @Transactional
    @Override
    public void add(User user) {
//        em.getTransaction().begin();
        em.persist(user);
//        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void delete(User user) {
//        em.getTransaction().begin();
        em.remove(user);
//        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void edit(User user) {
//        em.getTransaction().begin();
        em.merge(user);
//        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public User getById(int id) {
        return em.find(User.class, id);

    }
}
