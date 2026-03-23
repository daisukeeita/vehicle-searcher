package com.javv.vehicle.domain.vehicle;

/**
 * DTO class for API Response.
 */
public class VehicleResponseDto {

  private String lastInspectionId;
  private String mvFileNumber;
  private String plateNumber;
  private String chassisNumber;
  private String engineNumber;
  private String brand;
  private String manufacturer;
  private String fuelType;
  private String categoryType;
  private String color;
  private String engineCapacity;
  private String maximumTotalWeight;
  private String modelYear;
  private String firstRegistrationDate;

  /**
   * Constructs a new {@code VehicleResponseDto}.
   */
  public VehicleResponseDto() {
  }

  /**
   * Checks the value of parameter and sets the value of Last Inspection ID.
   *
   * @param lastInspectionId The last inspection ID of the vehicle to be set.
   */
  public void setLastInspectionId(final String lastInspectionId) {
    if (checkForEmptyOrNull(lastInspectionId)) {
      this.lastInspectionId = "Inspection ID was not provided.";
    }

    this.lastInspectionId = lastInspectionId;
  }

  /**
   * Checks the value of parameter and sets the value of MV File Number.
   *
   * @param mvFileNumber the MV File Number of the vehicle to be set.
   */
  public void setMvFileNumber(final String mvFileNumber) {
    if (checkForEmptyOrNull(mvFileNumber)) {
      this.mvFileNumber = "MV File Number was not provided.";
    }

    this.mvFileNumber = mvFileNumber;
  }

  /**
   * Checks the value of parameter and sets the value of Plate Number.
   *
   * @param plateNumber The Plate Number of the vehicle to be set.
   */
  public void setPlateNumber(final String plateNumber) {
    if (checkForEmptyOrNull(plateNumber)) {
      this.mvFileNumber = "Plate Number was not provided.";
    }

    this.plateNumber = plateNumber;
  }

  /**
   * Checks the value of parameter and sets the value of Chassis Number.
   *
   * @param chassisNumber The Chassis Number of the vehicle to be set.
   */
  public void setChassisNumber(final String chassisNumber) {
    if (checkForEmptyOrNull(chassisNumber)) {
      this.chassisNumber = "Chassis Number was not provided.";
    }

    this.chassisNumber = chassisNumber;
  }

  /**
   * Checks the value of parameter and sets the value of Engine Number.
   *
   * @param engineNumber The Engine Number of the vehicle to be set.
   */
  public void setEngineNumber(final String engineNumber) {
    if (checkForEmptyOrNull(engineNumber)) {
      this.engineNumber = "Engine Number was not provided.";
    }

    this.engineNumber = engineNumber;
  }

  /**
   * Checks the value of parameter and sets the value of Brand.
   *
   * @param brand The Brand of the vehicle to be set.
   */
  public void setBrand(final String brand) {
    if (checkForEmptyOrNull(brand)) {
      this.brand = "Brand was not provided.";
    }

    this.brand = brand;
  }

  /**
   * Checks the value of parameter and sets the value of Manufacturer.
   *
   * @param manufacturer The Manufacturer of the vehicle to be set.
   */
  public void setManufacturer(final String manufacturer) {
    if (checkForEmptyOrNull(manufacturer)) {
      this.manufacturer = "Manufacturer was not provided.";
    }

    this.manufacturer = manufacturer;
  }

  /**
   * Checks the value of parameter and sets the value of Fuel Type.
   *
   * @param fuelType The Fuel Type of the vehicle to be set.
   */
  public void setFuelType(final String fuelType) {
    if (checkForEmptyOrNull(fuelType)) {
      this.fuelType = "Fuel Type was not provided.";
    }

    this.fuelType = fuelType;
  }

  /**
   * Checks the value of parameter and sets the value of Category Type.
   *
   * @param categoryType The Category Type of the vehicle to be set.
   */
  public void setCategoryType(final String categoryType) {
    if (checkForEmptyOrNull(categoryType)) {
      this.categoryType = "Category was not provided.";
    }

    this.categoryType = categoryType;
  }

  /**
   * Checks the value of parameter and sets the value of Color.
   *
   * @param color The Color of the vehicle to be set.
   */
  public void setColor(final String color) {
    if (checkForEmptyOrNull(color)) {
      this.color = "Color was not provided.";
    }

    this.color = color;
  }

  /**
   * Checks the value of parameter and sets the value of Engine Capacity.
   *
   * @param engineCapacity The Engine Capacity of the vehicle to be set.
   */
  public void setEngineCapacity(final String engineCapacity) {
    if (checkForEmptyOrNull(engineCapacity)) {
      this.engineCapacity = "Engine Capacity was not provided.";
    }

    this.engineCapacity = engineCapacity;
  }

  /**
   * Checks the value of parameter and sets the value of Maximum Total Weight.
   *
   * @param maximumTotalWeight The Maximum Total Weight of the vehicle to be
   *                           set.
   */
  public void setMaximumTotalWeigh(final String maximumTotalWeight) {
    if (checkForEmptyOrNull(maximumTotalWeight)) {
      this.maximumTotalWeight = "Maximum Total Weight was not provided.";
    }

    this.maximumTotalWeight = maximumTotalWeight;
  }

  /**
   * Checks the value of parameter and sets the value of Model Year.
   *
   * @param modelYear The Model Year of the vehicle to be set.
   */
  public void setModelYear(final String modelYear) {
    if (checkForEmptyOrNull(modelYear)) {
      this.modelYear = "Model Year was not provided.";
    }

    this.modelYear = modelYear;
  }

  /**
   * Checks the value of parameter and sets the value of First Registration
   * Date.
   *
   * @param firstRegistrationDate The First Registration Date of the vehicle to
   *                              be set.
   */
  public void setFirstRegistrationDate(final String firstRegistrationDate) {
    if (checkForEmptyOrNull(firstRegistrationDate)) {
      this.firstRegistrationDate = "First Registration Date was not provided.";
    }

    this.firstRegistrationDate = firstRegistrationDate;
  }

  public String getLastInspectionId() {
    return lastInspectionId;
  }

  public String getMvFileNumber() {
    return mvFileNumber;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public String getChassisNumber() {
    return chassisNumber;
  }

  public String getEngineNumber() {
    return engineNumber;
  }

  public String getBrand() {
    return brand;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getFuelType() {
    return fuelType;
  }

  public String getCategoryType() {
    return categoryType;
  }

  public String getColor() {
    return color;
  }

  public String getEngineCapacity() {
    return engineCapacity;
  }

  public String getMaximumTotalWeight() {
    return maximumTotalWeight;
  }

  public String getModelYear() {
    return modelYear;
  }

  public String getFirstRegistrationDate() {
    return firstRegistrationDate;
  }

  private boolean checkForEmptyOrNull(final String field) {
    return field == null
        || field == "NA"
        || field.trim().isEmpty();
  }

}
