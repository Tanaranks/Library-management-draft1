package com.example.spring4.Services;

import com.example.spring4.Entity.Library_users;
import com.example.spring4.Repository.LibraryUser_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
@Autowired
    private LibraryUser_repo libraryUserRepo;
public Library_users create(Library_users libraryUsers){
    return libraryUserRepo.save(libraryUsers);

}
public Optional<Library_users> readone(Long id){
    return libraryUserRepo.findById(id);
}
public List<Library_users> readall(){
   return libraryUserRepo.findAll();
}
public Library_users update(Long id, Library_users refresh){
    refresh.setUserId(id);
   return libraryUserRepo.save(refresh);
}
public void delete (Long id){
    libraryUserRepo.deleteById(id);
}
}

