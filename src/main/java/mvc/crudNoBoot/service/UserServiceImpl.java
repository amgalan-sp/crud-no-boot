package mvc.crudNoBoot.service;

import mvc.crudNoBoot.dao.UserDao;
import mvc.crudNoBoot.dao.UserDaoImpl;
import mvc.crudNoBoot.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao = new UserDaoImpl();

    @Transactional
    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
    @Transactional
    @Override
    public void edit(User user) {
        userDao.edit(user);
    }
    @Transactional
    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }
}
