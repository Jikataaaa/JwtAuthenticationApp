package com.example.JwtAuthenticationApplication.utils;

import com.example.JwtAuthenticationApplication.service.JwtService;
import com.example.JwtAuthenticationApplication.service.impl.JwtServiceImpl;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


public class AuthUtil {

    private static final JwtService jwtService = new JwtServiceImpl();
    public static String validateToken(String token){
        String extractUsername;
        try {
            extractUsername = jwtService.extractUsername(token);
        }catch (MalformedJwtException | ExpiredJwtException e){
            return null;
        }
        return extractUsername;
    }
}
