package  org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class User{
    private static Integer user_id = 1;
    private String name;
    private Integer id;
    private ArrayList<User> List_friends;
    private ArrayList<Post> List_posts;

    public User(String name){
        this.id = User.user_id;
        User.user_id ++;
        this.name = name;
        this.List_friends = new ArrayList<User>();
        this.List_posts = new ArrayList<Post>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<User> getList_friends() {
        return List_friends;
    }

    public void setList_friends(ArrayList<User> list_friends) {
        List_friends = list_friends;
    }

    public ArrayList<Post> getList_posts() {
        return List_posts;
    }

    public void setList_posts(ArrayList<Post> list_posts) {
        List_posts = list_posts;
    }
}