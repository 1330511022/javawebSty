package com.javaweb.news;

public class NewsLink {
    private String title;
    private String content;
    private String author;
    private String created_at;

    public NewsLink() {
    }

    public NewsLink(String title, String content, String author, String created_at) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.created_at = created_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
