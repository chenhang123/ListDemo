package com.example.ontop.listdemo.bean;

import java.io.Serializable;

/**
 * Created by Ontop on 2017/11/28.
 */

public class Article implements Serializable {
    private String conent;
    private String time;
    private String author;
    private String title;

    public String getConent() {
        return conent;
    }

    public void setConent(String conent) {
        this.conent = conent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
