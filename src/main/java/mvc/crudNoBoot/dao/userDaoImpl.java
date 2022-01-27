package mvc.crudNoBoot.dao;

import mvc.crudNoBoot.model.User;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class userDaoImpl implements UserDao{
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> users = new HashMap<>();
    static {
        User  user =  new User();
        user.setId(AUTO_ID.getAndIncrement());
        user.setName("Даржаев");
        user.setLastame("Амгалан");
        user.setAge(31);
        users.put(user.getId(),   user);
    }
    @Override
    public List<User> allUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }

    @Override
    public void edit(User user) {
        users.put(user.getId(),user);
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }
}