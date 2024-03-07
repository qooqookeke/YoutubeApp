package com.qooke.youtubeapp.model;

import java.io.Serializable;

public class Video implements Serializable {

    public String videoId;
    public String title;
    public String description;
    public String mediumUrl;
    public String highUrl;

    public Video(String videoId, String title, String description, String mediumUrl, String highUrl) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.mediumUrl = mediumUrl;
        this.highUrl = highUrl;
    }
}
