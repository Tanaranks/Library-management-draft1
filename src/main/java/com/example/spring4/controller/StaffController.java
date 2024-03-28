package com.example.spring4.controller;

import com.example.spring4.Entity.Book;
import com.example.spring4.Entity.Library_staff;
import com.example.spring4.Services.StaffServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
   private StaffServices staffServices;
@GetMapping
    public List<Library_staff>readallstaff(){
    return staffServices.readall();
}
@GetMapping("/staff/{id}")
    public Optional<Library_staff>readonestaff(@PathVariable Long id){
    return staffServices.readone(id);
}
@PutMapping("/update/{id}")
    public Library_staff updatstaff(@PathVariable Long id, @RequestBody Library_staff library_staff){
    return staffServices.update(id,library_staff);
}
@PostMapping ("/store")
    public Library_staff enterstaff(@RequestBody Library_staff library_staff){
    return staffServices.create(library_staff);
}
@DeleteMapping("/delete/{id}")
public void deleteuser(@PathVariable Long id){
    staffServices.delete(id);
    }
}
