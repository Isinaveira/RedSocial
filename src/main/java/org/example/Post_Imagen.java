package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Post_Imagen extends Post{

    private String image_title;
    private int width;
    private int heigth;
    public Post_Imagen (Date date_post, ArrayList<Comment> List_comments, String image_title, int width, int heigth){
        super(date_post, List_comments);
        this.image_title = image_title;
        this.width = width;
        this.heigth = heigth;

    }

    public String getImage_title() {
        return image_title;
    }

    public void setImage_title(String image_title) {
        this.image_title = image_title;
    }
}
