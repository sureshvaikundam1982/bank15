package com.bank.api_gateway.security;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.security.Key;



import java.security.Key;

public class JwtUtil {

    private static final String SECRET = "bank-secret-bank-secret-bank-secret";

    private static final Key key =
            Keys.hmacShaKeyFor(SECRET.getBytes());

    public static boolean validateToken(String token) {

        try {
            Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);

            return true;

        } catch (Exception e) {
            System.out.println("Invalid JWT: " + e.getMessage());
            return false;
        }
    }
}