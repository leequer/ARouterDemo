package com.wxmylife.morgan.lib1.bean;

/**
 * Created by wxmylife on 2017/4/21.
 */

public class Books {
    private String name;
    private String author;

    public Books() {
    }

    public Books(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
