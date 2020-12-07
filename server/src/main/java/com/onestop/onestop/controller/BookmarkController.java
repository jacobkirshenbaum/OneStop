package com.onestop.onestop.controller;


import com.onestop.onestop.Bookmark;
import com.onestop.onestop.dao.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/bookmark")
public class BookmarkController {

    @Autowired
    private BookmarkRepository bookmarkRepository;


    @CrossOrigin
    @GetMapping(path="/{username}")
    public ResponseEntity<List<Bookmark>> getAllBookmarks(@PathVariable("username") String username) {
        List<Bookmark> bookmarks = bookmarkRepository.findByUsername(username);
        return new ResponseEntity<>(bookmarks, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path="/{username}/save")
    public void saveBookmark(@RequestBody Bookmark bookmark) {
        bookmarkRepository.save(bookmark);
    }

    @CrossOrigin
    @DeleteMapping(path="/{username}/delete/{bookmarkName}")
    public void deleteBookmark(@PathVariable("bookmarkName") String bookmarkName, @PathVariable("username") String username) {
        bookmarkRepository.deleteBookmarkByBookmarkNameAndAndUsername(bookmarkName, username);
    }

}
