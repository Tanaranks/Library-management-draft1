package com.example.spring4.controller;

import com.example.spring4.Entity.Book;
import com.example.spring4.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired BookServices bookServices;
    @GetMapping
    public List<Book> readallbooks(){
        return bookServices.readall();
    }
@GetMapping("/book/{id}")
public Optional<Book> readOneTransaction(@PathVariable Long id) {
    return bookServices.readone(id);
}
    @PutMapping("/update/{id}")
    public Book updatebook(@PathVariable Long id, @RequestBody Book book){
        return bookServices.update(id, book);
    }
    @PostMapping ("/store")
    public Book enterbook(@RequestBody Book book){
        return bookServices.create(book);
}
    @DeleteMapping("/delete/{id}")
    public void deletebook(@PathVariable Long id){
        bookServices.delete(id);
}}
