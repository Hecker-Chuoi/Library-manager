package org.exercise.librarymanager.respository;

import org.exercise.librarymanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
