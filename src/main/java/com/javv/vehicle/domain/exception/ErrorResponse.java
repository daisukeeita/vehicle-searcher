package com.javv.vehicle.domain.exception;

public class ErrorResponse {
  private final int statusCode;
  private final String errorMessage;

  public ErrorResponse(int statusCode, String errorMessage) {
    this.statusCode = statusCode;
    this.errorMessage = errorMessage;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
