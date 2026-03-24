package com.javv.vehicle.domain.vehicle;

public class Vehicle {

  private String inspectionId;
  private String purpose;

  private VehicleInformation vehicleInformation;
  private VehicleTestLimits vehicleTestLimits;

  public Vehicle(
      String inspectionId,
      String purpose,
      VehicleInformation vehicleInformation,
      VehicleTestLimits vehicleTestLimits) {
    this.inspectionId = inspectionId;
    this.purpose = purpose;
    this.vehicleInformation = vehicleInformation;
    this.vehicleTestLimits = vehicleTestLimits;
  }

  public String getInspectionId() {
    return inspectionId;
  }

  public String getPurpose() {
    return purpose;
  }

  public VehicleInformation getVehicleInformation() {
    return vehicleInformation;
  }

  public VehicleTestLimits getVehicleTestLimits() {
    return vehicleTestLimits;
  }
}
