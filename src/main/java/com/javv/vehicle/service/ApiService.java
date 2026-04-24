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

/**
 * The class for connecting to the third-part API link. Disabled the SSL Certifactes to test the
 * JSON data.
 */
public class ApiService {

  private final Dotenv dotenv = Dotenv.load();
  private final String apiUrl = dotenv.get("API_URL");
  private final ObjectMapper objectMapper = new ObjectMapper();

  /**
   * Method for POST request using the unsafe client connection.
   *
   * @param vehicleRequestDto The request body to be send.
   */
  public HttpResponse<String> postRequest(VehicleRequestDto vehicleRequestDto) {
    HttpClient httpClient = createUnsafeClient();
    String requestBody = objectMapper.writeValueAsString(vehicleRequestDto);
    HttpResponse<String> response = null;

    try {

      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create(apiUrl))
              .headers("Content-Type", "application/json")
              .POST(BodyPublishers.ofString(requestBody))
              .build();

      response = httpClient.send(request, BodyHandlers.ofString());

    } catch (Exception e) {
      e.printStackTrace();
    }

    return response;
  }

  /** Unsafe connection to the link. Will modify it in the future. */
  private HttpClient createUnsafeClient() {
    try {
      TrustManager[] trustAllCerts =
          new TrustManager[] {
            new X509TrustManager() {
              public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
              }

              public void checkClientTrusted(
                  java.security.cert.X509Certificate[] certs, String authType) {}

              public void checkServerTrusted(
                  java.security.cert.X509Certificate[] certs, String authType) {}
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

  // private VehicleResponseDto convertToDto(HttpResponse<String> response) {
  //   Vehicle vehicle = objectMapper.readValue(response.body(), Vehicle.class);
  //
  //   VehicleResponseDto vehicleResponseDto = new VehicleResponseDto();
  //   vehicleResponseDto.setLastInspectionId(vehicle.getInspectionId());
  //   vehicleResponseDto.setMvFileNumber(vehicle.getVehicleInformation().getMvFileNumber());
  //   vehicleResponseDto.setPlateNumber(vehicle.getVehicleInformation().getPlateNumber());
  //   vehicleResponseDto.setChassisNumber(vehicle.getVehicleInformation().getChassis());
  //   vehicleResponseDto.setEngineNumber(vehicle.getVehicleInformation().getEngine());
  //   vehicleResponseDto.setBrand(vehicle.getVehicleInformation().getBrand());
  //   vehicleResponseDto.setManufacturer(vehicle.getVehicleInformation().getManufacturer());
  //   vehicleResponseDto.setFuelType(vehicle.getVehicleInformation().getFuelType());
  //   vehicleResponseDto.setCategoryType(vehicle.getVehicleInformation().getCategoryType());
  //   vehicleResponseDto.setColor(vehicle.getVehicleInformation().getColor());
  //   vehicleResponseDto.setEngineCapacity(
  //       vehicle.getVehicleInformation().getEngineCapcity().toString());
  //   vehicleResponseDto.setMaximumTotalWeigh(
  //       vehicle.getVehicleInformation().getMaximumTotalWeight().toString());
  //   vehicleResponseDto.setModelYear(vehicle.getVehicleInformation().getModelYear());
  //   vehicleResponseDto.setFirstRegistrationDate(
  //       vehicle.getVehicleInformation().getDateFirstRegistration());
  //
  //   return vehicleResponseDto;
  // }
}
