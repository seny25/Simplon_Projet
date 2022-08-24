package DAO1;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

//public class CandidatsDao implements Dao{

public class CandidatsDao implements Dao{
	public String sql;
	public Db con;
	
	public void Read(Candidats candidats)  {
		// TODO Auto-generated method stub
		
		try {
			sql = "Select * from Candidats";

			con = new Db();

			Statement stat = (Statement) con.connect().createStatement();
			//ResultSet ResSet = stat.executeQuery(sql);
			ResultSet ResSet = ((java.sql.Statement) stat).executeQuery(sql);

			while (ResSet.next()) {
				
				candidats.setNom(ResSet.getString("Nom"));
				candidats.setPrenom(ResSet.getString("Prenom"));
				candidats.setMail(ResSet.getString("Mail"));
				candidats.setAdresse(ResSet.getString("Adresse"));
				candidats.setVille(ResSet.getString("Ville"));
				candidats.setPays(ResSet.getString("Pays"));
				
				System.out.println(candidats.toString());
				
			}
			ResSet.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Create(Candidats candidats)  {
		// TODO Auto-generated method stub
		
		try {
			con = new Db();
			
			PreparedStatement ps = con.connect().prepareStatement("Insert candidats Candidats values (?,?,?,?,?,?)");
			 
		
			ps.setString(1, candidats.getNom());
			ps.setString(2, candidats.getPrenom());
			ps.setString(3, candidats.getMail());
			ps.setString(4,candidats.getAdresse());
			ps.setString(5,candidats.getVille());
			ps.setString(6,candidats.getPays());

			ps.execute();

			con.connect().commit();
			ps.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Update(Candidats candidats) {
		// TODO Auto-generated method stub
		try {
			con = new Db();
			
			sql = "UPDATE Candidats SET Nom = '"+candidats.getNom() +"',Prenom = '"+candidats.getPrenom() +"',Mail = '" + candidats.getMail() + "',"
					+ "Adresse = '"+ candidats.getAdresse() +"',Ville = '"+ candidats.getVille() +"',Pays = '"+ candidats.getPays() +"' "
							+ "WHERE Nom = '" +candidats.getNom()+  "'";
			
			
			PreparedStatement ps = con.connect().prepareStatement(sql);

			ps.execute();

			con.connect().commit();
			ps.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Delete(Candidats candidats)  {
		// TODO Auto-generated method stub
		try {
			con = new Db();
			
			sql = "DELETE FROM Candidats WHERE Nom = '" +"'";

			PreparedStatement ps = con.connect().prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


		
}





