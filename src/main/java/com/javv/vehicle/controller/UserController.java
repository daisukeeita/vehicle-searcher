package com.javv.vehicle.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

import com.javv.vehicle.domain.exception.ErrorResponse;
import com.javv.vehicle.domain.user.User;
import com.javv.vehicle.domain.user.UserRegister;
import com.javv.vehicle.exception.MethodException;
import com.javv.vehicle.persistence.UserRepository;
import com.javv.vehicle.service.UserService;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import tools.jackson.databind.ObjectMapper;

public class UserController implements HttpHandler {

  private final ObjectMapper objectMapper = new ObjectMapper();
  private final UserService userService = new UserService();
  private final UserRepository userRepository = new UserRepository();

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    String method = exchange.getRequestMethod();

    try {
      if ("POST".equalsIgnoreCase(method)) {
        handlePost(exchange);
      } else if ("GET".equalsIgnoreCase(method)) {
        handleGet(exchange);
      } else {
        throw new MethodException("Method Not Allowed", 405);
      }
    } catch (MethodException exception) {
      ErrorResponse errorResponse =
          new ErrorResponse(exception.getStatusCode(), exception.getMessage());
      String response = objectMapper.writeValueAsString(errorResponse);

      throwException(exchange, exception.getStatusCode(), response);
    } catch (SQLException exception) {
      ErrorResponse errorResponse =
          new ErrorResponse(exception.getStatusCode(), exception.getMessage());
      String response = objectMapper.writeValueAsString(errorResponse);

      throwException(exchange, exception.getStatusCode(), response);
    }
  }

  private void handlePost(HttpExchange exchange) throws IOException, SQLException {
    InputStream inputStream = exchange.getRequestBody();
    String requestBody = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    UserRegister userRegister = objectMapper.readValue(requestBody, UserRegister.class);

    User user = new User();
    user.setName(userRegister.getName());
    user.setUsername(userRegister.getUsername());
    user.setHashedPassword(userService.hashPassword(userRegister.getPassword()));

    userRepository.saveUser(user);
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
