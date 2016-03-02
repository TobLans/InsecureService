package login.insecure.java.service;

import login.insecure.java.domain.User;

/**
 * Created by Tobbe on 01/03/16.
 */
public interface UserService {

    User getUser(String user, String pass);

}
