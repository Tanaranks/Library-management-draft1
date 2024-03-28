package com.example.spring4.Services;

import com.example.spring4.Entity.Book;
import com.example.spring4.Repository.Book_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookServices {
    @Autowired
    private Book_Repo book_repo;
    public Book create(Book book){
        return book_repo.save(book);
    }
    public Optional<Book> readone(Long id){
        return book_repo.findById(id);
    }
    public List<Book> readall(){
        return book_repo.findAll();
    }
    public Book update(Long id, Book refresher){
        refresher.setBookId(id);
        return book_repo.save(refresher);
    }
    public void delete( Long id){
     book_repo.deleteById(id);
    }
}

