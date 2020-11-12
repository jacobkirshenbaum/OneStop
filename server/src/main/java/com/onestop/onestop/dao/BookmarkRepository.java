package com.onestop.onestop.dao;

import com.onestop.onestop.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, String> {
    List<Bookmark> findByUsername(String username);

    @Query(value="DELETE FROM bookmarks WHERE NAME = ?1 AND USERNAME = ?2", nativeQuery = true)
    void deleteBookmarkByBookmarkNameAndAndUsername(String bookmarkName, String Username);
}
