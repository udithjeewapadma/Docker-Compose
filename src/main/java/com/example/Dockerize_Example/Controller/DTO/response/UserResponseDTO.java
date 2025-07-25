package com.example.Dockerize_Example.Controller.DTO.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponseDTO {

    private Long id;
    private String username;
    private String email;
}
