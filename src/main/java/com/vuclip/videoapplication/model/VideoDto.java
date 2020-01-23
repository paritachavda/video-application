package com.vuclip.videoapplication.model;

import org.springframework.stereotype.Component;

@Component
public class VideoDto {
    int vid;
    private String title,description;

    public VideoDto() {}

    public VideoDto(String title) {

        this.title = title;

    }
    public VideoDto(String title, String description) {
        this.title=title;
        this.description = description;

    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
