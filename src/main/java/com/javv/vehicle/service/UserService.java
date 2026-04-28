package com.javv.vehicle.service;

import com.password4j.Hash;
import com.password4j.Password;

public class UserService {

  public String hashPassword(String plainPassword) {
    Hash hashedPassword = Password.hash(plainPassword).withBcrypt();

    return hashedPassword.getResult();
  }

  public boolean verifyPassword(String hashedPassword, String providedPassword) {
    return Password.check(providedPassword, hashedPassword).withBcrypt();
  }
}
