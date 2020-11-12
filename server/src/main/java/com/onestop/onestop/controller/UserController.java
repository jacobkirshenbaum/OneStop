package com.onestop.onestop.controller;

import com.onestop.onestop.User;
import com.onestop.onestop.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @GetMapping(path="/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path="/save")
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
