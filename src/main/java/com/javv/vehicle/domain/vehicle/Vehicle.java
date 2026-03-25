package com.javv.vehicle.domain.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {

  @JsonProperty("Inspection_ID")
  private String inspectionId;

  @JsonProperty("Purpose")
  private String purpose;

  @JsonProperty("Vehicle_Information")
  private VehicleInformation vehicleInformation;

  @JsonProperty("Test_Limits")
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

  @Override
  public String toString() {
    return "Vehicle {"
        + "\n\tinspectionId: " + inspectionId
        + ",\n\tpurpose: " + purpose
        + ",\n\t" + vehicleInformation
        + ",\n\t" + vehicleTestLimits
        + "\n}";
  }

}
