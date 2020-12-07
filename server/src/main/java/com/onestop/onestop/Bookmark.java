package com.onestop.onestop;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookmarks")
public class Bookmark {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "USERNAME")
    private String username;


    @Column(name = "NAME")
    private String bookmarkName;

    @Column
    private String url;


    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getBookmarkName() {
        return this.bookmarkName;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void setBookmarkName(String newBookmarkName) {
        this.bookmarkName = newBookmarkName;
    }

    public void setUrl(String newUrl) {
        this.url = newUrl;
    }

}
