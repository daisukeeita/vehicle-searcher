package com.javv.vehicle.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;

import com.javv.vehicle.domain.exception.ErrorResponse;
import com.javv.vehicle.domain.vehicle.VehicleRequestDto;
import com.javv.vehicle.exception.InvalidQueryException;
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
    } catch (InvalidQueryException exception) {
      ErrorResponse errorResponse =
          new ErrorResponse(exception.getStatusCode(), exception.getMessage());
      String response = objectMapper.writeValueAsString(errorResponse);

      throwException(exchange, exception.getStatusCode(), response);
    }
  }

  private void handleGet(HttpExchange exchange) throws IOException {
    URI requestUri = exchange.getRequestURI();
    String query = requestUri.getQuery();

    String[] entry = query.split("=");

    String key = entry[0].length() > 1 ? entry[0] : "";
    String value = entry[1].length() > 1 ? entry[1] : "";

    switch (key) {
      case "plateNo":
        vehicleRequestDto.setPlateNumber(value);
        break;
      case "chassisNo":
        vehicleRequestDto.setChassisNumber(value);
        break;
      case "engineNo":
        vehicleRequestDto.setEngineNumber(value);
        break;
      case "vinNo":
        vehicleRequestDto.setVinNumber(value);
        break;
      case "mvFileNumber":
        vehicleRequestDto.setMvFileNumber(value);
        break;
      default:
        throw new InvalidQueryException("Invalid Query Key Propery", 400);
    }

    String response = objectMapper.writeValueAsString(vehicleRequestDto);

    exchange.getResponseHeaders().set("Content-Type", "application/json");
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
