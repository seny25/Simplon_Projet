package DAO1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

			
			public Connection connect() {
				
				try {

					return (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbbrief5", "postgres", "1234");
					
					
				}catch(SQLException e) {
					System.out.println(e.getMessage());
					return null;
				}
			}
			
		}
		

