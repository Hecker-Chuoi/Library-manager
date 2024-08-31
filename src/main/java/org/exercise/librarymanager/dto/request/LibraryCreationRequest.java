package org.exercise.librarymanager.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class LibraryCreationRequest {
    private String address;
    private Date startIn;
}
