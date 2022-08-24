package Dao_pakage;
import java.sql.Connection;

import Classe.Conexion;
import Classe.Produits;

//import Class.Connexion;
import java.sql.*;

public class Daoproduits implements Dao<Produits>{
public String sql;
public Conexion con;
public void ajouter(Produits prod) {
	try {
	sql="insert into produits values (?,?,?,?,?,?,?)";
	
	 con = new Conexion();
	//con.connect();
	PreparedStatement ps= con.connect().prepareStatement(sql);
		ps.setInt(1,prod.getId_produit() );
		ps.setString(2,prod.getNom() );
		ps.setInt(3,prod.getCode() );
		ps.setInt(4,prod.getQtestock() );
		ps.setDouble(5,prod.getPrix_unitaire() );
		ps.setInt(6,prod.getId_categorie());
		ps.setInt(7,prod.getId_unite() );
		
		
		ps.execute();
		ps.close();
		
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
}
public void supprimer(Produits prod) {

	try {
		con = new Conexion(); 
		sql=" delete from produits where id_produit="+prod.getId_produit();
		
		PreparedStatement ps=con.connect().prepareStatement(sql);
		ps.execute();
		ps.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
}
public void modifier(Produits prod) {
	try {
		con = new Conexion();
		sql=" update produits set code ="+prod.getCode()+",nom='"+prod.getNom()+"',qtestock="+prod.getQtestock()
		+",prix_unitaire="+prod.getPrix_unitaire() ;
		PreparedStatement ps =con.connect().prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
public void lister(Produits prod) {
	try {
		con = new Conexion();
		
		sql="select *from produits";
		Statement ps = con.connect().createStatement();
		ResultSet ResSet=ps.executeQuery(sql);
		
	while(ResSet.next()) {
		prod.setId_produit(ResSet.getInt("id_produit"));
		prod.setNom(ResSet.getString("nom"));
		prod.setCode(ResSet.getInt("code"));
		prod.setId_categorie(ResSet.getInt("id_categorie"));
		prod.setPrix_unitaire(ResSet.getDouble("prix unitaire"));
		prod.setQtestock(ResSet.getInt("quantite"));
		prod.setId_unite(ResSet.getInt("id_unite"));
		
		System.out.println(prod.toString());
	}
		
	ResSet.close();	
	} 
	
	catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	
}
	
}
