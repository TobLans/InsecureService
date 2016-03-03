package login.insecure.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by Tobbe on 01/03/16.
 */
@SpringBootApplication
public class InsecureLogin extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(InsecureLogin.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(InsecureLogin.class);
    }
}
