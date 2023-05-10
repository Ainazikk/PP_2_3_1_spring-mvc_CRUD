package web.dao;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        TypedQuery<User> query = entityManager.createQuery("select u from User u", User.class);
        return query.getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void remove(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public User update(User user) {
        return entityManager.merge(user);
    }

    @Override
    public User show_user(int id) {
        return entityManager.find(User.class,id);
    }
}
