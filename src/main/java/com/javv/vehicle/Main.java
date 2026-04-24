package com.javv.vehicle;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.javv.vehicle.controller.AuthController;
import com.javv.vehicle.controller.VehicleController;
import com.sun.net.httpserver.HttpServer;

/** The primary container for the application's execution logic. */
public class Main {
  /** The entry point of the application. */
  public static void main(final String[] args) throws IOException {
    InetSocketAddress socketAddress = new InetSocketAddress(8080);
    HttpServer server = HttpServer.create(socketAddress, 0);

    server.createContext("/", new VehicleController());
    server.createContext("/auth", new AuthController());

    server.setExecutor(null);
    System.out.println("Server started on port 8080...");
    server.start();
  }
}
