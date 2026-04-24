package com.javv.vehicle.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import com.javv.vehicle.exception.MethodException;
import com.javv.vehicle.service.JwtService;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import tools.jackson.databind.ObjectMapper;

public class AuthController implements HttpHandler {
  private JwtService jwtService = new JwtService();
  private ObjectMapper objectMapper = new ObjectMapper();

  Map<String, Object> extraClaims = Map.of("role", "ADMIN");
  String token = jwtService.createToken("admin_user", extraClaims);

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    String method = exchange.getRequestMethod();

    if ("GET".equalsIgnoreCase(method)) {

      String response = "Hello, this is the token!";

      exchange.getResponseHeaders().set("Authorization", "Bearer " + token);
      exchange.getResponseHeaders().set("Content-Type", "application/json");
      exchange.sendResponseHeaders(200, response.length());

      try (OutputStream outputStream = exchange.getResponseBody()) {
        outputStream.write(response.getBytes());
        System.out.println(token);
      }
    } else {
      throw new MethodException("Method Not Allowed", 405);
    }
  }

  private void handleGet(HttpExchange exchange) throws IOException {}

  private void throwException(HttpExchange exchange, int statusCode, String message)
      throws IOException {
    byte[] response = message.getBytes(StandardCharsets.UTF_8);
    exchange.getResponseHeaders().set("Content-Type", "application/json");
    exchange.sendResponseHeaders(statusCode, response.length);
    try (OutputStream outputStream = exchange.getResponseBody()) {
      outputStream.write(response);
    }
  }
}
