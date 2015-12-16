package com.potato.hot.hatly.model;

/**
 * Created by omar on 16/12/15.
 */
public class Comment {
    private User user;
    private String text;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
