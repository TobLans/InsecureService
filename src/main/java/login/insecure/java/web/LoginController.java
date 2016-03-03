package login.insecure.java.web;

import login.insecure.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tobbe on 01/03/16.
 */

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @Transactional(readOnly = true)
    public String helloWorld(){
        return "Hello world!";
    }

    @RequestMapping("/login")
    @Transactional(readOnly = true)
    public boolean login(@RequestParam("user") String user, @RequestParam("pass") String pass) {
        return this.userService.getUser(user, pass) != null;
    }
}
