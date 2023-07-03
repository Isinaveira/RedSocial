
package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Post{
    private Date date_post;
    private ArrayList<Comment> List_comments;

    public Post(Date date_post, ArrayList<Comment> List_comments){
        this.date_post = date_post;
        this.List_comments = new ArrayList<Comment>();
    }

    public Date getDate_post() {
        return date_post;
    }

    public void setDate_post(Date date_post) {
        this.date_post = date_post;
    }

    public ArrayList<Comment> getList_comments() {
        return List_comments;
    }

    public void setList_comments(ArrayList<Comment> list_comments) {
        List_comments = list_comments;
    }
}