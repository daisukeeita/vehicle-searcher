package com.javv.vehicle.exception;

public class InvalidQueryException extends RuntimeException {
  private int statusCode;

  public InvalidQueryException(String message, int statusCode) {
    super(message);
    this.statusCode = statusCode;
  }

  public int getStatusCode() {
    return statusCode;
  }
}
