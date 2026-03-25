package com.javv.vehicle.domain.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information of the vehicle from the third-party API.
 */
public class VehicleInformation {

  @JsonProperty("Historic_Vehicle")
  private String historicVehicle;

  @JsonProperty("Equivalent_Inertia")
  private Integer equivalentInertia;

  @JsonProperty("Fuel_Type")
  private String fuelType;

  @JsonProperty("Traction_Type")
  private String tractionType;

  @JsonProperty("Number_Of_Axes")
  private Integer numberOfAxes;

  @JsonProperty("Model_Year")
  private String modelYear;

  @JsonProperty("Engine_Capacity")
  private Integer engineCapacity;

  @JsonProperty("Category")
  private String category;

  @JsonProperty("Category_Type")
  private String categoryType;

  @JsonProperty("Chassis")
  private String chassis;

  @JsonProperty("Engine")
  private String engine;

  @JsonProperty("MV_File_Number")
  private String mvFileNumber;

  @JsonProperty("Circulation_Date")
  private String circulationDate;

  @JsonProperty("Color")
  private String color;

  @JsonProperty("Licence_Plate")
  private String plateNumber;

  @JsonProperty("Manufacturer")
  private String manufacturer;

  @JsonProperty("Brand")
  private String brand;

  @JsonProperty("Mileage")
  private Integer mileage;

  @JsonProperty("VIN")
  private String vin;

  @JsonProperty("Turbo")
  private String turbo;

  @JsonProperty("Presence_Of_Catalytic_Converter")
  private String presenceOfCatalyticConverter;

  @JsonProperty("Maximum_Total_Weight")
  private Integer maximumTotalWeight;

  @JsonProperty("Date_First_Registration")
  private String dateFirstRegistration;

  /**
   * Default constructor of class.
   */
  public VehicleInformation() {
  }

  /**
   * Constructs a new {@code VehicleInformation}.
   *
   * @param historicVehicle              The history of the vehicle.
   * @param equivalentInertia            The equivalent inertia of the vehicle.
   * @param fuelType                     The fuel type of the vehicle.
   * @param tractionType                 The traction type of the vehicle.
   * @param numberOfAxes                 The number of axes of the vehicle.
   * @param modelYear                    The model year of the vehicle.
   * @param engineCapacity               The engine capacity of the vehicle.
   * @param category                     The category of the vehicle.
   * @param categoryType                 The category type of the vehicle.
   * @param chassis                      The chassis of the vehicle.
   * @param engine                       The engine of the vehicle.
   * @param mvFileNumber                 The MV file number of the vehicle.
   * @param circulationDate              The circulation date of the vehicle.
   * @param color                        The color of the vehicle.
   * @param plateNumber                  The plate number of the vehicle.
   * @param manufacturer                 The manufacturer of the vehicle.
   * @param brand                        The brand of the vehicle.
   * @param mileage                      The mileage of the vehicle.
   * @param vin                          The vin of the vehicle.
   * @param turbo                        The turbo type of the vehicle.
   * @param presenceOfCatalyticConverter The catalytic converter of the
   *                                     vehicle.
   * @param maximumTotalWeight           The maximum total weight of the vehicle.
   * @param dateFirstRegistration        The first registration date of the
   *                                     vehicle.
   */
  public VehicleInformation(
      String historicVehicle,
      Integer equivalentInertia,
      String fuelType,
      String tractionType,
      Integer numberOfAxes,
      String modelYear,
      Integer engineCapacity,
      String category,
      String categoryType,
      String chassis,
      String engine,
      String mvFileNumber,
      String circulationDate,
      String color,
      String plateNumber,
      String manufacturer,
      String brand,
      Integer mileage,
      String vin,
      String turbo,
      String presenceOfCatalyticConverter,
      Integer maximumTotalWeight,
      String dateFirstRegistration) {
    this.historicVehicle = historicVehicle;
    this.equivalentInertia = equivalentInertia;
    this.fuelType = fuelType;
    this.tractionType = tractionType;
    this.numberOfAxes = numberOfAxes;
    this.modelYear = modelYear;
    this.engineCapacity = engineCapacity;
    this.category = category;
    this.categoryType = categoryType;
    this.chassis = chassis;
    this.engine = engine;
    this.mvFileNumber = mvFileNumber;
    this.circulationDate = circulationDate;
    this.color = color;
    this.plateNumber = plateNumber;
    this.manufacturer = manufacturer;
    this.brand = brand;
    this.mileage = mileage;
    this.vin = vin;
    this.turbo = turbo;
    this.presenceOfCatalyticConverter = presenceOfCatalyticConverter;
    this.maximumTotalWeight = maximumTotalWeight;
    this.dateFirstRegistration = dateFirstRegistration;
  }

  public void setHistoricVehicle(String historicVehicle) {
    this.historicVehicle = historicVehicle;
  }

  public void setEquivalentInertia(Integer equivalentInertia) {
    this.equivalentInertia = equivalentInertia;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public void setTractionType(String tractionType) {
    this.tractionType = tractionType;
  }

  public void setNumberOfAxes(Integer numberOfAxes) {
    this.numberOfAxes = numberOfAxes;
  }

  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
  }

  public void setEngineCapacity(Integer engineCapacity) {
    this.engineCapacity = engineCapacity;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }

  public void setChassis(String chassis) {
    this.chassis = chassis;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setMvFileNumber(String mvFileNumber) {
    this.mvFileNumber = mvFileNumber;
  }

  public void setCirculationDate(String circulationDate) {
    this.circulationDate = circulationDate;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setMileage(Integer mileage) {
    this.mileage = mileage;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public void setTurbo(String turbo) {
    this.turbo = turbo;
  }

  public void setPresenceOfCatalyticConverter(String presenceOfCatalyticConverter) {
    this.presenceOfCatalyticConverter = presenceOfCatalyticConverter;
  }

  public void setMaximumTotalWeight(Integer maximumTotalWeight) {
    this.maximumTotalWeight = maximumTotalWeight;
  }

  public void setDateFirstRegistration(String dateFirstRegistration) {
    this.dateFirstRegistration = dateFirstRegistration;
  }

  public String getHistoricVehicle() {
    return historicVehicle;
  }

  public Integer getEquivalentIntertia() {
    return equivalentInertia;
  }

  public String getFuelType() {
    return fuelType;
  }

  public String getTractionType() {
    return tractionType;
  }

  public Integer getNumberOfAxes() {
    return numberOfAxes;
  }

  public String getModelYear() {
    return modelYear;
  }

  public Integer getEngineCapcity() {
    return engineCapacity;
  }

  public String getCategory() {
    return category;
  }

  public String getCategoryType() {
    return categoryType;
  }

  public String getChassis() {
    return chassis;
  }

  public String getEngine() {
    return engine;
  }

  public String getMvFileNumber() {
    return mvFileNumber;
  }

  public String getCirculationDate() {
    return circulationDate;
  }

  public String getColor() {
    return color;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getBrand() {
    return brand;
  }

  public Integer getMileage() {
    return mileage;
  }

  public String getVin() {
    return vin;
  }

  public String getTurbo() {
    return turbo;
  }

  public String getPresenceOfCatalyticConverter() {
    return presenceOfCatalyticConverter;
  }

  public Integer getMaximumTotalWeight() {
    return maximumTotalWeight;
  }

  public String getDateFirstRegistration() {
    return dateFirstRegistration;
  }

  @Override
  public String toString() {
    return "VehicleInformation {"
        + "\n\thistoricVehicle: " + historicVehicle
        + ",\n\tequivalentInertia: " + equivalentInertia
        + ",\n\tfuelType: " + fuelType
        + ",\n\ttractionType: " + tractionType
        + ",\n\tnumberOfAxes: " + numberOfAxes
        + ",\n\tmodelYear: " + modelYear
        + ",\n\tengineCapacity: " + engineCapacity
        + ",\n\tcategory: " + category
        + ",\n\tcategoryType: " + categoryType
        + ",\n\tchassis: " + chassis
        + ",\n\tengine: " + engine
        + ",\n\tmvFileNumber: " + mvFileNumber
        + ",\n\tcirculationDate: " + circulationDate
        + ",\n\tcolor: " + color
        + ",\n\tplateNumber: " + plateNumber
        + ",\n\tmanufacturer: " + manufacturer
        + ",\n\tbrand: " + brand
        + ",\n\tmileage: " + mileage
        + ",\n\tvin: " + vin
        + ",\n\tturbo: " + turbo
        + ",\n\tpresenceOfCatalyticConverter: " + presenceOfCatalyticConverter
        + ",\n\tmaximumTotalWeight: " + maximumTotalWeight
        + ",\n\tdateFirstRegistration: " + dateFirstRegistration
        + "\n}";
  }

}
