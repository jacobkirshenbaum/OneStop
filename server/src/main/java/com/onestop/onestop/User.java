package com.onestop.onestop;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "USERNAME")
    private String username;


    @Column(name = "PASSWORD")
    private String password;



    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
