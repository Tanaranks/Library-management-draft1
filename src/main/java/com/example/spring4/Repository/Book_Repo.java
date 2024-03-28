package com.example.spring4.Repository;

import com.example.spring4.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book_Repo extends JpaRepository<Book ,Long> {

}