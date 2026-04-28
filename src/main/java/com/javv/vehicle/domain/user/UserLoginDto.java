package com.javv.vehicle.domain.user;

public class UserLoginDto {
  private String username;
  private String providedPassword;

  public UserLoginDto() {}

  public void setUsername(String username) {
    this.username = username;
  }

  public void setProvidedPassword(String providedPassword) {
    this.providedPassword = providedPassword;
  }

  public String getUsername() {
    return username;
  }

  public String getProvidedPassword() {
    return providedPassword;
  }
}
