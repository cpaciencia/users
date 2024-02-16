package com.tenantevaluation.training.users.login.infraestructure.adapter.primary;

import com.tenantevaluation.training.users.login.application.dto.LoginDto;
import com.tenantevaluation.training.users.login.application.port.in.LoginPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final LoginPort loginPort;

    public LoginController(LoginPort loginPort) {
        this.loginPort = loginPort;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
        boolean success = loginPort.login(loginDto.getUsername(), loginDto.getPassword());
        if (success) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }


}
