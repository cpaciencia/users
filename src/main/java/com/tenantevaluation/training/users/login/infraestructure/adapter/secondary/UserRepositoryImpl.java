package com.tenantevaluation.training.users.login.infrastructure.adapter.secondary.persistence.repository;

import com.tenantevaluation.training.users.login.application.port.out.UserRepository;
import com.tenantevaluation.training.users.login.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User findByUsername(String username) {
        // Respuesta moqueada para la demostración
        return new User(username, "passwordHash");
    }
}
