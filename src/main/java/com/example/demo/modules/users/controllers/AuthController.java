package com.example.demo.modules.users.controllers;

import com.example.demo.modules.users.dtos.requests.LoginRequest;
import com.example.demo.modules.users.dtos.responses.LoginResponse;
import com.example.demo.modules.users.services.interfaces.UserServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/auth")
public class AuthController {

  private final UserServiceInterface userService;

  public AuthController(
      UserServiceInterface userService
  ) {
    this.userService = userService;
  }

  @PostMapping("login")
  public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
    LoginResponse auth = userService.login(request);
    return ResponseEntity.ok(auth);
  }
}
