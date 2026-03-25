package com.javv.vehicle.domain.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The reference test limit of a vehicle to be tested.
 */
public class VehicleTestLimits {

  @JsonProperty("light_intensity")
  private String lightIntensity;

  @JsonProperty("brake_service_eff")
  private String brakeServiceEfficiency;

  @JsonProperty("brake_parking_eff")
  private String brakeParkingEfficiency;

  @JsonProperty("brake_service_diff")
  private String brakeServiceDifference;

  @JsonProperty("sideslip_deviation")
  private String sideslipDeviation;

  @JsonProperty("suspension_deviation")
  private String suspensionDeviation;

  @JsonProperty("speed_deviation")
  private String speedDeviation;

  @JsonProperty("sound_level")
  private String soundLevel;

  @JsonProperty("emission_hc")
  private String emissionHc;

  @JsonProperty("emission_co")
  private String emissionCo;

  @JsonProperty("opacity_k")
  private String opacityK;

  /**
   * Constructs a new {@code VehicleTestLimits} without parameters.
   */
  public VehicleTestLimits() {
  }

  /**
   * Constructs a new {@code VehicleTestLimits} with parameters.
   *
   * @param lightIntensity         The threshold value of light intensity of the
   *                               vehicle to be tested.
   * @param brakeServiceEfficiency The threshold value of braking efficiency of
   *                               the vehicle to be tested.
   * @param brakeParkingEfficiency The threshold value of parking brake
   *                               efficiency of the vehicle to be tested.
   * @param brakeServiceDifference The threshold value of braking difference of
   *                               the vehicle to be tested.
   * @param sideslipDeviation      The threshold value of sideslip deviation of
   *                               the
   *                               vehicle to be tested.
   * @param suspensionDeviation    The threshold value of suspension deviation of
   *                               the vehicle to be tested.
   * @param speedDeviation         The threshold Value of speed deviation of the
   *                               vehicle
   *                               to be tested.
   * @param soundLevel             The threshold value of sound level of the
   *                               vehicle to be
   *                               tested.
   * @param emissionHc             The threshold value of hydro-carbon emission of
   *                               the
   *                               vehicle to be tested.
   * @param emissionCo             The threshold value of carbon-monoxide emission
   *                               of the
   *                               vehicle to be tested.
   * @param opacityK               The threshold value of equilibrium constant
   *                               opacity of the
   *                               vehicle to be tested.
   */
  public VehicleTestLimits(
      final String lightIntensity,
      final String brakeServiceEfficiency,
      final String brakeParkingEfficiency,
      final String brakeServiceDifference,
      final String sideslipDeviation,
      final String suspensionDeviation,
      final String speedDeviation,
      final String soundLevel,
      final String emissionHc,
      final String emissionCo,
      final String opacityK) {
    this.lightIntensity = lightIntensity;
    this.brakeServiceEfficiency = brakeServiceEfficiency;
    this.brakeParkingEfficiency = brakeParkingEfficiency;
    this.brakeServiceDifference = brakeServiceDifference;
    this.sideslipDeviation = sideslipDeviation;
    this.suspensionDeviation = suspensionDeviation;
    this.speedDeviation = speedDeviation;
    this.soundLevel = soundLevel;
    this.emissionHc = emissionHc;
    this.emissionCo = emissionCo;
    this.opacityK = opacityK;
  }

  public void setLightIntensity(final String lightIntensity) {
    this.lightIntensity = lightIntensity;
  }

  public void setBrakeServiceEfficiency(final String brakeServiceEfficiency) {
    this.brakeServiceEfficiency = brakeServiceEfficiency;
  }

  public void setBrakeParkingEfficiency(final String brakeParkingEfficiency) {
    this.brakeParkingEfficiency = brakeParkingEfficiency;
  }

  public void setBrakeServiceDifference(final String brakeServiceDifference) {
    this.brakeServiceDifference = brakeServiceDifference;
  }

  public void setSideslipDeviation(final String sideslipDeviation) {
    this.sideslipDeviation = sideslipDeviation;
  }

  public void setSuspensionDeviation(final String suspensionDeviation) {
    this.suspensionDeviation = suspensionDeviation;
  }

  public void setSpeedDeviation(final String speedDeviation) {
    this.speedDeviation = speedDeviation;
  }

  public void setSoundLevel(final String soundLevel) {
    this.soundLevel = soundLevel;
  }

  public void setEmissionHc(final String emissionHc) {
    this.emissionHc = emissionHc;
  }

  public void setEmissionCo(final String emissionCo) {
    this.emissionCo = emissionCo;
  }

  public void setOpacityK(final String opacityK) {
    this.opacityK = opacityK;
  }

  public String getLightIntensity() {
    return lightIntensity;
  }

  public String getBrakeServiceEfficiency() {
    return brakeServiceEfficiency;
  }

  public String getBrakeParkingEfficiency() {
    return brakeParkingEfficiency;
  }

  public String getBrakeServiceDifference() {
    return brakeServiceDifference;
  }

  public String getSideslipDeviation() {
    return sideslipDeviation;
  }

  public String getSuspensionDeviation() {
    return suspensionDeviation;
  }

  public String getSpeedDeviation() {
    return speedDeviation;
  }

  public String getSoundLevel() {
    return soundLevel;
  }

  public String getEmissionHc() {
    return emissionHc;
  }

  public String getEmissionCo() {
    return emissionCo;
  }

  public String getOpacityK() {
    return opacityK;
  }

  @Override
  public String toString() {
    return "VehicleTestLimits {"
        + "\n\tlightIntensity: " + lightIntensity
        + ",\n\tbrakeServiceEfficiency: " + brakeServiceEfficiency
        + ",\n\tbrakeParkingEfficiency: " + brakeParkingEfficiency
        + ",\n\tbrakeServiceDifference: " + brakeServiceDifference
        + ",\n\tsideslipDeviation: " + sideslipDeviation
        + ",\n\tsuspensionDeviation: " + suspensionDeviation
        + ",\n\tspeedDeviation: " + speedDeviation
        + ",\n\tsoundLevel: " + soundLevel
        + ",\n\temissionHc: " + emissionHc
        + ",\n\temissionCo: " + emissionCo
        + ",\n\topacityK: " + opacityK
        + "\n}";
  }

}
