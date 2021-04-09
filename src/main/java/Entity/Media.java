package Entity;

import java.util.ArrayList;
import java.util.List;

public class Media implements java.io.Serializable{
    private List<User> users = new ArrayList<>();
    private static Media restaurant;
    private Media(){}

    public static Media getMedia() {
        if(restaurant==null){
            restaurant = new Media();
        }
        return restaurant;
    }

    public void addUser (User user){
        users.add(user);
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

}
