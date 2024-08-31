package org.exercise.librarymanager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private Date startIn;
    @ManyToMany
    Set<Book> books;

    public void setAddress(String address) {
    }
}
