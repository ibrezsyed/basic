package com.myapp.dto;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class CustomerDto {

    @NotNull
    @Size(min=2, message="Name should have atleast 2 characters")
    private String name;
    
    @NotNull
    @Size(min=4, message="Atlesast 4 Characters in Emial")
    private String email;
    
    @NotNull
    @Size(min=10 , message="Atleast 10 numbers")
    @Size( max = 13, message = "Maximum 13 Numbers Allowed")
    private String mobNumber;
}
