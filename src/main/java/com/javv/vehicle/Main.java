package com.javv.vehicle;

import com.javv.vehicle.domain.vehicle.Vehicle;
import com.javv.vehicle.domain.vehicle.VehicleInformation;
import com.javv.vehicle.domain.vehicle.VehicleTestLimits;

/**
 * The primary container for the application's execution logic.
 */
public class Main {
  /**
   * The entry point of the application.
   */
  public static void main(final String[] args) {
    System.out.println("Hello There");

    VehicleInformation vehicleInformation = new VehicleInformation(
        "NA",
        1234,
        "Hybrid",
        "NA",
        null,
        "2024",
        1798,
        "SUV",
        "SUV",
        "MR2KZAAG4R0078870",
        "2ZRZ088174",
        "040124001699405",
        "2024-01-01T00:00:00",
        "EMOTIONAL RED 2/ATTITUDE BLACK MICA",
        "DNW2714",
        "TOYOTA",
        "COROLLA CROSS 1.8 GR-S HEV CVT 2T ER - A",
        1234,
        "MR2KZAAG4R0078870",
        "NA",
        "NA",
        1850,
        "2024-04-24T00:00:00");

    VehicleTestLimits vehicleTestLimits = new VehicleTestLimits(
        ">=10000",
        ">=50",
        ">=20",
        "<=10",
        "<=7",
        ">=21",
        "<=20",
        "<=99",
        "<=100",
        "<=0.25",
        null);

    Vehicle vehicle = new Vehicle(
        "4DBB80E3504D7747E0630C14640A020A",
        "REGULAR",
        vehicleInformation,
        vehicleTestLimits);

    System.out.println(vehicleInformation.toString());
    System.out.println(" ");
    System.out.println(vehicleTestLimits.toString());
    System.out.println(" ");
    System.out.println(vehicle.toString());
  }
}
