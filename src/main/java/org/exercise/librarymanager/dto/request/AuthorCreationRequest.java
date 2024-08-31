package org.exercise.librarymanager.dto.request;

import lombok.*;

import java.util.Date;

@Data
public class AuthorCreationRequest {
    private String firstName;
    private String lastName;
    private Date dob;
    private String gender;
}
