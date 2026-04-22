package com.javv.vehicle.exception;

public class QueryException extends RuntimeException {
  private final int statusCode;

  public QueryException(String message, int statusCode) {
    super(message);
    this.statusCode = statusCode;
  }

  public int getStatusCode() {
    return statusCode;
  }
}
