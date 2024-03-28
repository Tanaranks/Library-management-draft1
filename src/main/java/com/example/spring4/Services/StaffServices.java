package com.example.spring4.Services;

import com.example.spring4.Entity.Book;
import com.example.spring4.Entity.Library_staff;
import com.example.spring4.Repository.LibraryStaff_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServices {
    @Autowired
    private LibraryStaff_repo libraryStaffRepo;

    public Library_staff create(Library_staff library_staff) {
        return libraryStaffRepo.save(library_staff);
    }

    public Optional<Library_staff> readone(Long id) {
        return libraryStaffRepo.findById(id);
    }

    public List<Library_staff> readall() {
        return libraryStaffRepo.findAll();
    }

    public Library_staff update(Long id, Library_staff refresher) {
        refresher.setStaffId(id);
        return libraryStaffRepo.save(refresher);
    }

    public void delete(Long id) {
        libraryStaffRepo.deleteById(id);
    }
}