package org.exercise.librarymanager.respository;

import org.exercise.librarymanager.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
