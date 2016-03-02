package login.insecure.java.service;

import login.insecure.java.domain.User;
import org.springframework.data.repository.Repository;

/**
 * Created by Tobbe on 01/03/16.
 */
interface UserRepository extends Repository<User, Long> {
    User findFirstByName(String name);
}
