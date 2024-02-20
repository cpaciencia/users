package com.tenantevaluation.training.users.login.application.service;

import com.tenantevaluation.training.users.login.application.port.in.LoginPort;
import com.tenantevaluation.training.users.login.application.port.out.UserRepository;
import com.tenantevaluation.training.users.login.domain.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService implements LoginPort {

    private final UserRepository userRepository;


    @Override
    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPasswordHash().equals(password);
    }
}
