package com.example.Dockerize_Example.Repository;

import com.example.Dockerize_Example.Moddel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
