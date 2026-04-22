package com.javv.vehicle.exception;

/** The parent Exception Class to be used by the exception sub-classes. */
public class BaseApplicationException extends RuntimeException {
  private final int statusCode;

  /**
   * Class constructor.
   *
   * @param message The exception message to be thrown.
   * @param statusCode The exception status code to be thrown.
   */
  public BaseApplicationException(String message, int statusCode) {
    super(message);
    this.statusCode = statusCode;
  }

  public int getStatusCode() {
    return statusCode;
  }
}
