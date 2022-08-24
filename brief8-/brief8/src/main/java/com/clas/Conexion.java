package com.clas;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {



    static Connection con=null;
    public Conexion(){}
    public static Connection getConexion(){
        try {


            if (con==null){
                Class.forName("org.postgresql.jdbc.Driver");
                System.out.println("je suis connecte");
                con= DriverManager.getConnection("jdbc:postgresql://localhost/brief8","postgresql","1234");
            }

        }catch (Exception e) {
           // System.out.println(e.getMessage());
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,e);

        }

        return con;
    }



}


