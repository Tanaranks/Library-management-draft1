package com.example.spring4.Repository;

import com.example.spring4.Entity.Library_staff;
import com.example.spring4.Entity.Library_users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryUser_repo extends JpaRepository<Library_users, Long> {
}
