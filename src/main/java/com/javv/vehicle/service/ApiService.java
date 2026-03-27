package com.javv.vehicle.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.security.SecureRandom;
import java.time.Duration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.javv.vehicle.domain.vehicle.VehicleRequestDto;

import io.github.cdimascio.dotenv.Dotenv;
import tools.jackson.databind.ObjectMapper;

public class ApiService {

  private final Dotenv dotenv = Dotenv.load();
  private final String apiUrl = dotenv.get("API_URL");
  private final ObjectMapper objectMapper = new ObjectMapper();

  private HttpClient createUnsafeClient() {
    try {
      TrustManager[] trustAllCerts = new TrustManager[] {
          new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
              return null;
            }

            public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }
          }
      };
      SSLContext sslContext = SSLContext.getInstance("TLS");
      sslContext.init(null, trustAllCerts, new SecureRandom());

      return HttpClient.newBuilder()
          .connectTimeout(Duration.ofSeconds(10))
          .sslContext(sslContext)
          .build();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void postRequest(VehicleRequestDto vehicleRequestDto) {
    HttpClient httpClient = createUnsafeClient();
    String requestBody = objectMapper.writeValueAsString(vehicleRequestDto);

    try {

      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(apiUrl))
          .headers("Content-Type", "application/json")
          .POST(BodyPublishers.ofString(requestBody))
          .build();

      HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

      System.out.println("Status: " + response.statusCode());
      System.out.println("Headers: " + response.headers().allValues("Content-Type"));
      System.out.println("Body: " + response.body());

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
