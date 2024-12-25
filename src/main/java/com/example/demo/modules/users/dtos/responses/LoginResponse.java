package com.example.demo.modules.users.dtos.responses;

import com.example.demo.modules.users.dtos.UserDTO;

public class LoginResponse {

  private String token;
  private UserDTO user;

  public LoginResponse(String token, UserDTO user) {
    this.token = token;
    this.user = user;
  }

  public String getToken() {
    return token;
  }

  public UserDTO getUser() {
    return user;
  }
}
