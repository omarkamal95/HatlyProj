package com.potato.hot.hatly.model;

import java.text.DateFormat;
import java.util.ArrayList;

/**
 * Created by omar on 16/12/15.
 */
public class Post {
    private int postType;
    private String text;
    private String location;
    private ArrayList<Item> items;
    private ArrayList<Comment> comments;
    private User poster;
    private User PostedAt;
    private DateFormat createdAt;

    public int getPostType() {
        return postType;
    }

    public void setPostType(int postType) {
        this.postType = postType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getPoster() {
        return poster;
    }

    public void setPoster(User poster) {
        this.poster = poster;
    }

    public DateFormat getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateFormat createdAt) {
        this.createdAt = createdAt;
    }

    public User getPostedAt() {
        return PostedAt;
    }

    public void setPostedAt(User postedAt) {
        PostedAt = postedAt;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
