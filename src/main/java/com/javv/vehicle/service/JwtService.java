package com.javv.vehicle.service;

import java.util.Date;
import java.util.Map;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtService {
  private static final String SECRET = "secret-key";
  private final SecretKey key;

  public JwtService() {
    this.key = Keys.hmacShaKeyFor(SECRET.getBytes());
  }

  public String createToken(String subject, Map<String, Object> claims) {
    long now = System.currentTimeMillis();

    return Jwts.builder()
        .claims(claims)
        .subject(subject)
        .issuedAt(new Date(now))
        .expiration(new Date(now + 3600000))
        .signWith(key)
        .compact();
  }

  public Claims parseToken(String token) {
    return Jwts.parser().verifyWith(key).build().parseSignedClaims(token).getPayload();
  }
}
