package com.myapp.exceptions;


import lombok.Data;
import org.springframework.validation.FieldError;

import java.util.Date;
import java.util.List;

@Data
public class Errors {

    private Date timestamp;
    private String message;
    private List<String> details;

    public Errors(Date timestamp, String message, List<String> details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
