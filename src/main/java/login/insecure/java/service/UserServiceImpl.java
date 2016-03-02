/**
 * Created by Tobbe on 01/03/16.
 */

package login.insecure.java.service;

import login.insecure.java.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Component("userService")
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(String userName, String pass) {
        Assert.notNull(userName, "userName must be set");
        Assert.notNull(pass, "pass must be set");

        String hql = "from User u where u.name = :username and u.pass ='" + pass + "'";

        TypedQuery query = em.createQuery(hql, User.class)
                .setParameter("username", userName);
        User result = null;
        try {
            result = (User) query.getSingleResult();
        } catch (NoResultException e) {
        } finally {
            return result;
        }
    }
}
