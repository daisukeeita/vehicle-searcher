package com.javv.vehicle.domain.vehicle;

/**
 * DTO class for API request.
 */
public class VehicleRequestDto {

  private String chassisNumber;
  private String engineNumber;
  private String vinNumber;
  private String plateNumber;
  private String mvFileNumber;

  /**
   * Constructs a new {@code VehicleRequestDto}.
   */
  public VehicleRequestDto() {
  }

  public void setChassisNumber(String chassisNumber) {
    this.chassisNumber = chassisNumber;
  }

  public void setEngineNumber(String engineNumber) {
    this.engineNumber = engineNumber;
  }

  public void setVinNumber(String vinNumber) {
    this.vinNumber = vinNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public void setMvFileNumber(String mvFileNumber) {
    this.mvFileNumber = mvFileNumber;
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
