package org.exercise.librarymanager.controller;

import org.exercise.librarymanager.dto.request.AuthorCreationRequest;
import org.exercise.librarymanager.dto.response.AuthorGettingResponse;
import org.exercise.librarymanager.entity.Author;
import org.exercise.librarymanager.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService service;

    @PostMapping
    public AuthorGettingResponse post(@RequestBody AuthorCreationRequest request){
        return service.post(request);
    }

    @GetMapping("/{id}")
    public AuthorGettingResponse get (@PathVariable("id") Long id){
        return service.get(id);
    }

    @GetMapping
    public List<AuthorGettingResponse> getAll(){
        return service.getAll();
    }
}
