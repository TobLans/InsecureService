package login.insecure.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Tobbe on 01/03/16.
 */
@SpringBootApplication
public class InsecureLogin {
    public static void main(String[] args) {
        SpringApplication.run(InsecureLogin.class, args);
    }
}
