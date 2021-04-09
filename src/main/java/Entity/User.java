package Entity;

import java.util.ArrayList;
import java.util.List;

public class User implements java.io.Serializable{
    private String name;
    private String lastname;
    private String password;
    private List<Post> posts = new ArrayList<>();

    public User() {
    }

    public User(String name, String lastname, String password) {
        this.name = name;
        this.lastname = lastname;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
