package org.exercise.librarymanager.service;

import jakarta.persistence.ManyToMany;
import org.exercise.librarymanager.dto.request.LibraryCreationRequest;
import org.exercise.librarymanager.entity.Book;
import org.exercise.librarymanager.entity.Library;
import org.exercise.librarymanager.respository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository repo;

    private Library convertToEntity(LibraryCreationRequest request){
        Library library = new Library();
        library.setAddress(request.getAddress());
        library.setStartIn(request.getStartIn());
        library.setBooks(null);
        return library;
    }

    public Library get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Library doesn't exist."));
    }

    public List<Library> getAll(){
        return repo.findAll();
    }

    public Library post(LibraryCreationRequest request){
        Library library = convertToEntity(request);
        return repo.save(library);
    }

}
