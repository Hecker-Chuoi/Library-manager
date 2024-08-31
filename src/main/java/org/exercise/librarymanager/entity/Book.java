package org.exercise.librarymanager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter @Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date dateReleased;
    private String publisher;
    private int quantity;
    @ManyToMany
    Set<Author> authors;
}
