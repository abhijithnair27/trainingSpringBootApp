package com.consultadd.training.repository;

import com.consultadd.training.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepsitory extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
