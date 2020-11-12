package com.onestop.onestop;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "USERNAME")
    private String username;


    @Column(name = "BOOKMARK")
    private boolean bookmarks;



    public String getUsername() {
        return this.username;
    }

    public boolean getBookmarks() {
        return this.bookmarks;
    }
}
