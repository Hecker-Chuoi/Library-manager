package org.exercise.librarymanager.controller;

import org.exercise.librarymanager.dto.request.AuthorCreationRequest;
import org.exercise.librarymanager.dto.request.LibraryCreationRequest;
import org.exercise.librarymanager.dto.response.AuthorGettingResponse;
import org.exercise.librarymanager.entity.Library;
import org.exercise.librarymanager.service.AuthorService;
import org.exercise.librarymanager.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
    @Autowired
    private LibraryService service;

    @PostMapping
    public Library post(@RequestBody LibraryCreationRequest request){
        return service.post(request);
    }

    @GetMapping("/{id}")
    public Library get (@PathVariable("id") Long id){
        return service.get(id);
    }

    @GetMapping
    public List<Library> getAll(){
        return service.getAll();
    }
}
