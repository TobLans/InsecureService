/**
 * Created by Tobbe on 01/03/16.
 */

package login.insecure.java.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="myuser")
public class User implements Serializable {


    @Id
    @GeneratedValue
    private Long id;
    public Long getId() { return id; }

    @Column(nullable = false)
    private String name;
    public String getName() { return name; }

    @Column(nullable = false)
    private String pass;
    public String getPass() { return pass; }

    protected User() {}

    public User(String name, String pass) {
        super();
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return getName();
    }
}
