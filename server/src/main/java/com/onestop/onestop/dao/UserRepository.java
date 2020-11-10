package com.onestop.onestop.dao;

import com.onestop.onestop.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
