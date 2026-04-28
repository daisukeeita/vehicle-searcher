package com.javv.vehicle.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.javv.vehicle.domain.user.User;

import io.github.cdimascio.dotenv.Dotenv;

public class UserRepository {

  private final Dotenv dotenv = Dotenv.load();
  private final String dbUrl = dotenv.get("POSTGRES_DB_URL");
  private final String dbUser = dotenv.get("POSTGRES_DB_USER");
  private final String dbPassword = dotenv.get("POSTGRES_DB_PASSWORD");

  public void saveUser(User user) throws SQLException {
    String sql = "INSERT INTO users (id, name, username, hashed_password) VALUES (?, ?, ?, ?)";

    try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
      preparedStatement.setObject(1, user.getId());
      preparedStatement.setString(2, user.getName());
      preparedStatement.setString(3, user.getUsername());
      preparedStatement.setString(4, user.getHashedPassword());
      preparedStatement.executeUpdate();
    }
  }

  public User getUserByUsername(String username) throws SQLException {
    String sql = "SELECT * FROM users WHERE username = ?";

    try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

      preparedStatement.setString(1, username);

      try (ResultSet resultSet = preparedStatement.executeQuery()) {
        if (resultSet.next()) {
          User user = new User();
          user.setId(resultSet.getString("id"));
          user.setUsername(resultSet.getString("username"));
          user.setName(resultSet.getString("name"));
          user.setHashedPassword(resultSet.getString("hashed_password"));
          return user;
        }
      }
    }

    return null;
  }
}
