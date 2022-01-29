package mvc.crudNoBoot.service;

import mvc.crudNoBoot.dao.UserDao;
import mvc.crudNoBoot.dao.UserDaoImpl;
import mvc.crudNoBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao = new UserDaoImpl();

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> allUsers() {
        return userDao.allUsers();
    }


    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userDao.delete(user);
    }
    @Override
    @Transactional
    public void edit(User user) {
        userDao.edit(user);
    }


    @Override
    @Transactional
    public User getById(int id) {
        return userDao.getById(id);
    }
}
