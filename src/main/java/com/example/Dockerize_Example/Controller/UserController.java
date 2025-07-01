package com.example.Dockerize_Example.Controller;

import com.example.Dockerize_Example.Controller.DTO.request.CreateUserRequestDTO;
import com.example.Dockerize_Example.Controller.DTO.response.UserResponseDTO;
import com.example.Dockerize_Example.Moddel.User;
import com.example.Dockerize_Example.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO createUser(@RequestBody CreateUserRequestDTO createUserRequestDTO) {
        User user = userService.createUser(createUserRequestDTO);
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setUsername(user.getUsername());
        userResponseDTO.setEmail(user.getEmail());
        return userResponseDTO;
    }
}
