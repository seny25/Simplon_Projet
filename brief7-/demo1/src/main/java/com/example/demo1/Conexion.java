package com.example.demo1;

import java.sql.*;
public class Conexion {


    public static Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Connexion yes");
            return (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbbrief5", "postgres", "1234");


        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }

}