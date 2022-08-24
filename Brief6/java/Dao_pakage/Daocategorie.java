package Dao_pakage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Classe.Categories1;
import Classe.Categories1;
import Classe.Conexion;

public class Daocategorie implements Dao< Categories1>{
	public String sql;
	public Conexion con;
	
	
	
	public void ajouter(Categories1 cate) {
		
	try {
	sql="insert into  categorie values(?,?)";	
	 con = new Conexion();
	 PreparedStatement ps= con.connect().prepareStatement(sql);
	 ps.setInt(1,cate.getId_categorie() );
	ps.setString(2,cate.getNom_categorie() );
	ps.execute();
	ps.close();
	 
	 
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}	
		
		
	
		
		
	}

	public void supprimer(Categories1 cate) {
		try {
			 con = new Conexion();
			 sql="delete from  categorie where id_categorie="+cate.getId_categorie();
			 PreparedStatement ps=con.connect().prepareStatement(sql);
			 
			 ps.execute();
			 ps.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void modifier(Categories1 cate) {
	try {
		 con = new Conexion();
		sql=" update set nom_categorie='"+cate.getNom_categorie()+
				"where id_categorie="+cate.getId_categorie();
		PreparedStatement ps=con.connect().prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

	public void lister(Categories1 cate) {
		try {
			
			con = new Conexion();
			 sql=" select * from categorie";
			Statement stat= con.connect().createStatement();
			ResultSet ResSet=stat.executeQuery(sql);
			
			while(ResSet.next()) {
				
				cate.setId_categorie(ResSet.getInt("id categorie"));
				cate.setNom_categorie(ResSet.getString("nom"));
			}
			
			System.out.println(cate.getNom_categorie());
			
			ResSet.close(); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		
	}

}
