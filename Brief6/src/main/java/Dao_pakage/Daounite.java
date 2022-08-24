package Dao_pakage;

//import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.PreparedStatement;
import java.sql.Statement;

import Classe.Conexion;
import Classe.Produits;
import Classe.Unite;

public class Daounite implements Dao<Unite>{

		public String sql;
		public Conexion con;
	public void ajouter(Unite unit) {
	try {
		 
		 
		 sql="insert into unite values (?,?)";
		 con = new Conexion();
		 PreparedStatement ps=con.connect().prepareStatement(sql);
		 ps.setInt(1,unit.getId_unite());
		 ps.setString(2,unit.getNom() );
		 ps.execute();
		 ps.close();
		 
		 
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

	public void supprimer(Unite unit) {
		try {
			con = new Conexion();
			
			sql=" delete * from unite where unite="+unit.getId_unite();
			
			PreparedStatement ps=con.connect().prepareStatement(sql);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void modifier(Unite unit) {
		try {
			con = new Conexion();
			sql=" update unite set nom='"+unit.getNom()+
					"where id_unite="+unit.getId_unite() ;
			
			PreparedStatement ps=con.connect().prepareStatement(sql);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void lister(Unite unit) {
		try {
			con = new Conexion();
			
			sql="select* from unite";
			Statement stat=con.connect().createStatement();
			
			ResultSet ResSet= stat.executeQuery(sql);
			while(ResSet.next()) {
				unit.setId_unite(ResSet.getInt("id du unite"));
				unit.setNom(ResSet.getString("nom"));

				
				System.out.println(unit.toString());
			}
			
			ResSet.close();	
					
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
