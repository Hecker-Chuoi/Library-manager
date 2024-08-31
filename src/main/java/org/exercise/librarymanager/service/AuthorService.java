package org.exercise.librarymanager.service;

import org.exercise.librarymanager.dto.request.AuthorCreationRequest;
import org.exercise.librarymanager.dto.response.AuthorGettingResponse;
import org.exercise.librarymanager.entity.Author;
import org.exercise.librarymanager.respository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repo;

    private AuthorGettingResponse convertToResponse(Author author){
        AuthorGettingResponse response = new AuthorGettingResponse();
        response.setFirstName(author.getFirstName());
        response.setLastName(author.getLastName());
        response.setDob(author.getDob());
        response.setGender(author.getGender());
        response.setBookReleased(author.getBookReleased());

        return response;
    }

    private Author convertToEntity(AuthorCreationRequest request){
        Author author = new Author();
        author.setFirstName(request.getFirstName());
        author.setLastName(request.getLastName());
        author.setDob(request.getDob());
        author.setGender(request.getGender());
        author.setBookReleased(0);

        return author;
    }

    public AuthorGettingResponse get(Long id){
        Optional<Author> author = repo.findById(id);
        if(author.isEmpty()) throw new RuntimeException("Author'id not match");
        else
            return convertToResponse(author.get());
    }

    public List<AuthorGettingResponse> getAll(){
        List<Author> list = repo.findAll();
        List<AuthorGettingResponse> result = new ArrayList<>();
        for(Author author : list){
            result.add(convertToResponse(author));
        }
        return result;
    }

    public AuthorGettingResponse post(AuthorCreationRequest request){
        Author author = convertToEntity(request);
        repo.save(author);
        return convertToResponse(author);
    }
}
