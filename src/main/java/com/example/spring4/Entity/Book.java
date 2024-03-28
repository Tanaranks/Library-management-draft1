package com.example.spring4.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long bookId;
    private String title;
    private String author;
    private String genre;



    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private Library_users libraryUser;

//    @JsonIgnore
//    @ManyToOne()
//    private Library_users users;
}
