package com.youtube.springJwt.repository;

import com.youtube.springJwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer > {
    Optional<User> findByUsername(String username);
}
