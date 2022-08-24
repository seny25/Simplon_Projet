package Classe;
import java.sql.*;
public class Conexion {

	public Connection connect() {
		
		try {

			return (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gestion_Produits", "postgres", "1234");
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
