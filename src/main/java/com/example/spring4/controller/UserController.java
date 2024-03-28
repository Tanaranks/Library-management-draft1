package com.example.spring4.controller;

import com.example.spring4.Entity.Book;
import com.example.spring4.Entity.Library_staff;
import com.example.spring4.Entity.Library_users;
import com.example.spring4.Services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Library_users> readall() {
        return userService.readall();
    }

    @GetMapping("/staff/{id}")
    public Optional<Library_users> readone(@PathVariable Long id) {
        return userService.readone(id);
    }

    @PutMapping("/update/{id}")
    public Library_users updateuser(@PathVariable Long id, @RequestBody Library_users library_users) {
        return userService.update(id,library_users);
    }

    @PostMapping("/store")
    public Library_users enteruser(@RequestBody Library_users library_users) {
        return userService.create(library_users);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteuser(@PathVariable Long id){
        userService.delete(id);
}}


