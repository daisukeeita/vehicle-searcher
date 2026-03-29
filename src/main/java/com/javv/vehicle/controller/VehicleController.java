package com.javv.vehicle.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.javv.vehicle.domain.vehicle.VehicleRequestDto;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import tools.jackson.databind.ObjectMapper;

public class VehicleController implements HttpHandler {

  private final VehicleRequestDto vehicleRequestDto = new VehicleRequestDto();
  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    String method = exchange.getRequestMethod();

    if ("GET".equalsIgnoreCase(method)) {
      handleGet(exchange);
    } else {
      exchange.sendResponseHeaders(405, -1);
    }
  }

  private void handleGet(HttpExchange exchange) throws IOException {
    URI requestUri = exchange.getRequestURI();
    String query = requestUri.getRawQuery();

    Map<String, String> result = new HashMap<String, String>();
    String[] entry = query.split("=");
    result.put(entry[0], entry[1]);

    Set<String> keys = result.keySet();

    for (String key : keys) {
      if ("plateNo".equalsIgnoreCase(key)) {
        vehicleRequestDto.setPlateNumber(result.get(key));
      }
    }

    String response = objectMapper.writeValueAsString(vehicleRequestDto);

    exchange.sendResponseHeaders(200, response.length());

    try (OutputStream os = exchange.getResponseBody()) {
      os.write(response.getBytes());
    }
  }
}
