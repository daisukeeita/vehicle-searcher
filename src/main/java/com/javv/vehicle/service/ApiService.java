package com.javv.vehicle.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;

import com.javv.vehicle.domain.vehicle.VehicleRequestDto;

public class ApiService {

  private final HttpClient httpClient = HttpClient.newBuilder()
      .connectTimeout(Duration.ofSeconds(10))
      .build();

  public void postRequest(String url, VehicleRequestDto vehicleRequestDto) {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .header("Content-Type", "application/json")
        .header("Accept", "application/json")
        .build();
  }
}
