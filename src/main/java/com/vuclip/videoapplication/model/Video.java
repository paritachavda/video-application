package com.vuclip.videoapplication.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Video {


    @Id
    @GeneratedValue
    int vid;
    private String title,description;

    public Video() {}

    public Video(String title) {

        this.title = title;

    }
    public Video(String title, String description) {
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



