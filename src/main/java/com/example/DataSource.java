/*
* File: DataSource.java
* Author: Ritzl Bence
* Copyright: 2025, Ritzl Bence
* Group: Szoft II/1/N
* Date: 2025-02-27
* Github: https://github.com/BenceRitzl99/
* Licenc: GNU GPL
*/

package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DataSource {
    public static void createCylinder(Henger henger) {
        try {
            tryCreateCylinder(henger);
        } catch (Exception e) {
            System.err.println("hozzáadás sikertelen!");
            System.err.println(e.getMessage());
        }
    }

     public static void tryCreateCylinder(Henger henger) throws SQLException {
    Mariadb mariadb = new Mariadb();
    Connection conn = mariadb.connect();

    String sql = "INSERT INTO cylinders" + 
    "(sugar, magassag, felszin) VALUES" + 
    "(?, ?, ?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setDouble(1, henger.radius);
    ps.setDouble(2, henger.lenght);
    ps.setDouble(3, henger.surface);
    ps.execute();
    
  }
}
