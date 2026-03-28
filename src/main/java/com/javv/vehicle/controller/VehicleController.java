package com.javv.vehicle.controller;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class VehicleController implements HttpHandler {

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
    String response = "This is the GET endpoint of the server.";

    exchange.sendResponseHeaders(200, response.length());

    try (OutputStream os = exchange.getResponseBody()) {
      os.write(response.getBytes());
    }
  }
}
