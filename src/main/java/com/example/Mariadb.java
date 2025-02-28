/*
* File: Mariadb.java
* Author: Ritzl Bence
* Copyright: 2025, Ritzl Bence
* Group: Szoft II/1/N
* Date: 2025-02-27
* Github: https://github.com/BenceRitzl99/
* Licenc: GNU GPL
*/

package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb {
  public Connection tryConnect() {
    try {
      return connect();
    } catch (SQLException e) {
      System.err.println("Csatlakozás sikertelen!");
      System.err.println(e.getMessage());
      return null;
    }
  }

  public Connection connect() throws SQLException {
    String user = "root";
    String pass = "";
    String url = "jdbc:mariadb://localhost:3306/cylinders";
    Connection conn = DriverManager.getConnection(url, user, pass);
    return conn;
  }
}
