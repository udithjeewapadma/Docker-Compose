package com.example.Dockerize_Example.Service;

import com.example.Dockerize_Example.Controller.DTO.request.CreateUserRequestDTO;
import com.example.Dockerize_Example.Moddel.User;

public interface UserService {

    User createUser(CreateUserRequestDTO createUserRequestDTO);
}
