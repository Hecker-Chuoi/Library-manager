package org.exercise.librarymanager.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class AuthorGettingResponse {
    private String firstName;
    private String lastName;
    private Date dob;
    private String gender;
    private int bookReleased;
}
