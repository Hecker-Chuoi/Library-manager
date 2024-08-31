package org.exercise.librarymanager.service;

import org.exercise.librarymanager.dto.request.BookCreationRequest;
import org.exercise.librarymanager.dto.request.LibraryCreationRequest;
import org.exercise.librarymanager.entity.Book;
import org.exercise.librarymanager.entity.Library;
import org.exercise.librarymanager.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    private Book convertToEntity(BookCreationRequest request){
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setDateReleased(request.getDateReleased());
        book.setPublisher(request.getPublisher());
        book.setQuantity(request.getQuantity());

        return book;
    }

    public Book get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Library doesn't exist."));
    }

    public List<Book> getAll(){
        return repo.findAll();
    }

    public Book post(BookCreationRequest request){
        Book book = convertToEntity(request);
        return repo.save(book);
    }
}
