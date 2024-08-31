package org.exercise.librarymanager.respository;

import org.exercise.librarymanager.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
