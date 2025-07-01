package com.example.Dockerize_Example.Service.impl;

import com.example.Dockerize_Example.Controller.DTO.request.CreateUserRequestDTO;
import com.example.Dockerize_Example.Moddel.User;
import com.example.Dockerize_Example.Repository.UserRepository;
import com.example.Dockerize_Example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(CreateUserRequestDTO createUserRequestDTO) {
        User user = new User();
        user.setUsername(createUserRequestDTO.getUsername());
        user.setEmail(createUserRequestDTO.getEmail());
        return userRepository.save(user);
    }
}
