package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Post_text extends Post{
    private String text_post;
    public Post_text(Date date_post, ArrayList<Comment> List_comments, String text_post){
        super(date_post, List_comments);
        this.text_post = text_post;
    }

    public String getText_post() {
        return text_post;
    }

    public void setText_post(String text_post) {
        this.text_post = text_post;
    }
}
