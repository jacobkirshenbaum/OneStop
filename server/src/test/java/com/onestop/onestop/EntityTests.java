package com.onestop.onestop;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
@Transactional
public class EntityTests {


    @Test
    public void setBookmarkUsername() {
        Bookmark bookmark = new Bookmark();
        bookmark.setUsername("TestUsername");
        assertEquals("TestUsername", bookmark.getUsername());
    }

    @Test
    public void setBookmarkName() {
        Bookmark bookmark = new Bookmark();
        bookmark.setBookmarkName("TestBookmarkName");
        assertEquals("TestBookmarkName", bookmark.getBookmarkName());
    }

    @Test
    public void setBookmarkUrl() {
        Bookmark bookmark = new Bookmark();
        bookmark.setUrl("TestUrl");
        assertEquals("TestUrl", bookmark.getUrl());
    }

    @Test
    public void getBookmarkId() {
        Bookmark bookmark = new Bookmark();
        assertNotNull(bookmark.getId());
    }

    @Test
    public void getBookmarkInfo() {
        Bookmark bookmark = new Bookmark();
        bookmark.setUsername("TestUsername");
        bookmark.setBookmarkName("TestBookmarkName");
        bookmark.setUrl("TestURL");
        assertEquals("TestUsername", bookmark.getUsername());
        assertEquals("TestBookmarkName", bookmark.getBookmarkName());
        assertEquals("TestURL", bookmark.getUrl());
    }

    @Test
    public void setUserUserName() {
        User user = new User();
        user.setUsername("TestUsername");
        assertEquals("TestUsername", user.getUsername());
    }

    @Test
    public void setUserPassword() {
        User user = new User();
        user.setPassword("TestPassword");
        assertEquals("TestPassword", user.getPassword());
    }

}
