package com.javv.vehicle.domain.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO class for API request.
 */
public class VehicleRequestDto {

  @JsonProperty("chassis_no")
  private String chassisNumber = "";

  @JsonProperty("engine_no")
  private String engineNumber = "";

  @JsonProperty("vin_no")
  private String vinNumber = "";

  @JsonProperty("plate_no")
  private String plateNumber = "";

  @JsonProperty("mv_file_no")
  private String mvFileNumber = "";

  /**
   * Constructs a new {@code VehicleRequestDto}.
   */
  public VehicleRequestDto() {
  }

  public void setChassisNumber(String chassisNumber) {
    if (chassisNumber == null || chassisNumber.trim().isEmpty()) {
      this.chassisNumber = "";
    } else {
      this.chassisNumber = chassisNumber;
    }
  }

  public void setEngineNumber(String engineNumber) {
    if (engineNumber == null || engineNumber.trim().isEmpty()) {
      this.engineNumber = "";
    } else {
      this.engineNumber = engineNumber;
    }
  }

  public void setVinNumber(String vinNumber) {
    if (vinNumber == null || vinNumber.trim().isEmpty()) {
      this.vinNumber = "";
    } else {
      this.vinNumber = vinNumber;
    }
  }

  public void setPlateNumber(String plateNumber) {
    if (plateNumber == null || plateNumber.trim().isEmpty()) {
      this.plateNumber = "";
    } else {
      this.plateNumber = plateNumber;
    }
  }

  public void setMvFileNumber(String mvFileNumber) {
    if (mvFileNumber == null || mvFileNumber.trim().isEmpty()) {
      this.mvFileNumber = "";
    } else {
      this.mvFileNumber = mvFileNumber;
    }
  }

  public String getChassisNumber() {
    return chassisNumber;
  }

  public String getEngineNumber() {
    return engineNumber;
  }

  public String getVinNumber() {
    return vinNumber;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public String getMvFileNumber() {
    return mvFileNumber;
  }

  @Override
  public String toString() {
    return "VehicleRequestDto {"
        + "\n\tchassisNumber: " + chassisNumber
        + ",\n\tengineNumber: " + engineNumber
        + ",\n\tvinNumber: " + vinNumber
        + ",\n\tplateNumber: " + plateNumber
        + ",\n\tmvFileNumber: " + mvFileNumber
        + "\n}";
  }

}
