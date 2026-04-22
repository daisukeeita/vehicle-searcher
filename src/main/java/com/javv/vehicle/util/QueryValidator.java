package com.javv.vehicle.util;

public class QueryValidator {

  public void validateNotEmptyQuery(String fieldName, String value) {
    if (fieldName == null || fieldName.trim().isEmpty()) {
      throw new IllegalArgumentException(fieldName + " cannot be empty.");
    }
  }
}
