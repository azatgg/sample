package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class UsersDto {
    private UUID userId;
    private String lastName;
    private String firstName;
    private String patramonic;
}
