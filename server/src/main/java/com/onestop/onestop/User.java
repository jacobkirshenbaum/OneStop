package com.onestop.onestop;

import javax.persistence.*;


@Entity
@Table(name = "test_table")
public class User {
    @Id
    @Column(name = "test_id")
    private int id;

    @Column(name = "test_name")
    private String user;

    @Column(name = "test_pass")
    private String pass;


    public int getId() {
        return this.id;
    }

    public String getUser() {
        return this.user;
    }

    public String getPass() {
        return this.pass;
    }
}
