package com.tenantevaluation.training.users.login.application.port.out;

import com.tenantevaluation.training.users.login.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findByUsername(String username);
}
