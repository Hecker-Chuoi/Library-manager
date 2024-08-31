package org.exercise.librarymanager.controller;

import org.exercise.librarymanager.dto.request.AuthorCreationRequest;
import org.exercise.librarymanager.dto.request.BookCreationRequest;
import org.exercise.librarymanager.dto.response.AuthorGettingResponse;
import org.exercise.librarymanager.entity.Book;
import org.exercise.librarymanager.service.AuthorService;
import org.exercise.librarymanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping
    public Book post(@RequestBody BookCreationRequest request){
        return service.post(request);
    }

    @GetMapping("/{id}")
    public Book get (@PathVariable("id") Long id){
        return service.get(id);
    }

    @GetMapping
    public List<Book> getAll(){
        return service.getAll();
    }
}
