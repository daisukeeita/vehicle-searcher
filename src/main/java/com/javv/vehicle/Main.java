package com.javv.vehicle;

import com.javv.vehicle.domain.vehicle.VehicleRequestDto;
import com.javv.vehicle.service.ApiService;

import tools.jackson.databind.ObjectMapper;

/**
 * The primary container for the application's execution logic.
 */
public class Main {
  /**
   * The entry point of the application.
   */
  public static void main(final String[] args) {
    ObjectMapper mapper = new ObjectMapper();
    System.out.println("Hello There");

    VehicleRequestDto vehicleRequestDto = new VehicleRequestDto();
    vehicleRequestDto.setPlateNumber("DNW2714");

    ApiService apiService = new ApiService();
    apiService.postRequest(vehicleRequestDto);

  }
}
