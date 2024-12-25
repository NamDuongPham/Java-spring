package com.example.demo.modules.users.services.interfaces;

import com.example.demo.modules.users.dtos.requests.LoginRequest;
import com.example.demo.modules.users.dtos.responses.LoginResponse;

public interface UserServiceInterface {

  LoginResponse login(LoginRequest request);
}
