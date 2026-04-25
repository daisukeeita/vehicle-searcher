package com.javv.vehicle.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class DatabaseService {

  private final Dotenv dotenv = Dotenv.load();

  public void postgresConnector() {
    String dbUrl = dotenv.get("POSTGRES_DB_URL");
    String dbUser = dotenv.get("POSTGRES_DB_USER");
    String dbPassword = dotenv.get("POSTGRES_DB_PASSWORD");

    try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
      if (connection != null) {
        System.out.println("Connected to the PostgreSQL server successfully!");
      }
    } catch (SQLException exception) {
      System.err.println("Connection Failure: " + exception.getMessage());
    }
  }
}
