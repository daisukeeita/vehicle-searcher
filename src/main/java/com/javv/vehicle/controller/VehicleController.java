package com.javv.vehicle.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;

import com.javv.vehicle.domain.exception.ErrorResponse;
import com.javv.vehicle.domain.vehicle.VehicleRequestDto;
import com.javv.vehicle.exception.MethodException;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import tools.jackson.databind.ObjectMapper;

public class VehicleController implements HttpHandler {

  private final VehicleRequestDto vehicleRequestDto = new VehicleRequestDto();
  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    String method = exchange.getRequestMethod();

    try {
      if ("GET".equalsIgnoreCase(method)) {
        handleGet(exchange);
      } else {
        throw new MethodException("Method Not Allowed", 405);
      }
    } catch (MethodException e) {
      ErrorResponse errorResponse = new ErrorResponse(e.getStatusCode(), e.getMessage());
      String response = objectMapper.writeValueAsString(errorResponse);

      throwException(exchange, e.getStatusCode(), response);
    }
  }

  private void handleGet(HttpExchange exchange) throws IOException {
    URI requestUri = exchange.getRequestURI();
    String query = requestUri.getQuery();

    String[] entry = query.split("=");

    String key = entry[0].length() > 1 ? entry[0] : "";
    String value = entry[1].length() > 1 ? entry[1] : "";

    if ("plateNo".equalsIgnoreCase(key)) {
      vehicleRequestDto.setPlateNumber(value);
    }

    if ("chassisNo".equalsIgnoreCase(key)) {
      vehicleRequestDto.setChassisNumber(value);
    }

    if ("engineNo".equalsIgnoreCase(key)) {
      vehicleRequestDto.setEngineNumber(value);
    }

    if ("vinNo".equalsIgnoreCase(key)) {
      vehicleRequestDto.setVinNumber(value);
    }

    if ("mvFileNumber".equalsIgnoreCase(key)) {
      vehicleRequestDto.setMvFileNumber(value);
    }

    String response = objectMapper.writeValueAsString(vehicleRequestDto);

    exchange.sendResponseHeaders(200, response.length());

    try (OutputStream os = exchange.getResponseBody()) {
      os.write(response.getBytes());
    }
  }

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
