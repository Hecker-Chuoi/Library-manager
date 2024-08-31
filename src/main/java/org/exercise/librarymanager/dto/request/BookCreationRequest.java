package org.exercise.librarymanager.dto.request;

import jakarta.persistence.ManyToMany;
import lombok.Data;
import org.exercise.librarymanager.entity.Author;

import java.util.Date;
import java.util.Set;

@Data
public class BookCreationRequest {
    private String title;
    private Date dateReleased;
    private String publisher;
    private int quantity;
    Set<Long> authorIds;
}
