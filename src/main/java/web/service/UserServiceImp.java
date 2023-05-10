package web.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService{
    private UserDao userDao;

    public UserServiceImp(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void remove(int id) {
        userDao.remove(id);
    }

    @Override
    @Transactional
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public User show_user(int id) {
        return userDao.show_user(id);
    }
}
