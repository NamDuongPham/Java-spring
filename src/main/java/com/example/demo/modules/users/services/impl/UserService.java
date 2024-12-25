package com.example.demo.modules.users.services.impl;

import com.example.demo.modules.users.dtos.UserDTO;
import com.example.demo.modules.users.dtos.requests.LoginRequest;
import com.example.demo.modules.users.dtos.responses.LoginResponse;
import com.example.demo.modules.users.services.interfaces.UserServiceInterface;
import com.example.demo.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService implements UserServiceInterface {

  @Override
  public LoginResponse login(LoginRequest request) {
    try {
      String email = request.getEmail();
      String password = request.getPassword();
      String token = "random_token";
      UserDTO user = new UserDTO(1L, "phamnamduong@gmail.com");
      return new LoginResponse(token, user);
      
    } catch (Exception e) {
      throw new RuntimeException("Có vấn đề");
    }
  }
}
