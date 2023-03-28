package com.example.JwtAuthenticationApplication.service;

import com.example.JwtAuthenticationApplication.models.auth.AuthenticationResponse;
import com.example.JwtAuthenticationApplication.models.auth.LoginRequest;
import com.example.JwtAuthenticationApplication.models.auth.RegisterRequest;
import com.example.JwtAuthenticationApplication.models.entities.User;
import com.example.JwtAuthenticationApplication.models.enums.UserRole;
import com.example.JwtAuthenticationApplication.models.view.UserView;

import java.util.List;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse login(LoginRequest request);

    UserRole getUserRole(String username);

    User getUserByUsername(String username);

    List<UserView> getAllUsers();

}
