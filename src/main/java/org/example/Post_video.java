package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Post_video extends Post{

    private String video_title;
    private int duration;
    private VideoQualities quality;
    public Post_video(Date date_post, ArrayList<Comment> List_comments, String video_title, int duration, VideoQualities quality){
        super(date_post, List_comments);

        this.video_title = video_title;
        this.duration = duration;
        this.quality = quality;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public VideoQualities getQuality() {
        return quality;
    }

    public void setQuality(VideoQualities quality) {
        this.quality = quality;
    }
}
