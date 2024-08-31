package org.exercise.librarymanager.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private Date startIn;
    @ManyToMany
    Set<Book> books;
}
