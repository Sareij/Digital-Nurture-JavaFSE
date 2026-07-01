package com.cognizant.jwt.controller;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt.model.AuthenticationResponse;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    // Secret key (minimum 32 characters for HS256)
    private static final String SECRET =
            "cognizantjwtsecretkey123456789012345";

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        LOGGER.info("START");

        LOGGER.debug("Authorization Header : {}", authorizationHeader);

        // Remove "Basic "
        String encodedCredentials =
                authorizationHeader.substring("Basic ".length());

        // Decode username:password
        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        String username = credentials.split(":")[0];
        String password = credentials.split(":")[1];

        LOGGER.debug("Username : {}", username);
        LOGGER.debug("Password : {}", password);

        String token = generateJwt(username);

        LOGGER.info("END");

        return new AuthenticationResponse(token);
    }

    private String generateJwt(String username) {

        LOGGER.info("Generating JWT Token");

        SecretKey key = Keys.hmacShaKeyFor(SECRET.getBytes());

        String token = Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(key)
                .compact();

        LOGGER.debug("Generated Token : {}", token);

        return token;
    }
}