package mvc.crudNoBoot.service;

import mvc.crudNoBoot.dao.UserDao;
import mvc.crudNoBoot.dao.UserDaoImpl;
import mvc.crudNoBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }
}
