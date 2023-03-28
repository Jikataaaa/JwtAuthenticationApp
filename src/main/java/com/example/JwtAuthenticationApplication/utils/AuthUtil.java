package com.example.JwtAuthenticationApplication.utils;

import com.example.JwtAuthenticationApplication.service.JwtService;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthUtil {

    private static JwtService jwtService;
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
