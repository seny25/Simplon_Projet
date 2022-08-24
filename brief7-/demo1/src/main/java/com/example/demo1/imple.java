package com.example.demo1;

import java.sql.PreparedStatement;

public class imple implements interfaceDao{

    public String sql;
    public Conexion con;
    @Override
    public void Ajouter_candidat(Candidats candidats) {

        try {
            con = new Conexion();

            PreparedStatement ps = con.connect().prepareStatement("Insert candidats Candidats values (?,?,?,?,?,?)");

            ps.setInt(1, candidats.getId_candidats());
            ps.setString(2, candidats.getNom());
            ps.setString(3, candidats.getPrenom());
            ps.setString(4, candidats.getMail());
            ps.setString(5,candidats.getAdresse());
            ps.setString(6,candidats.getVille());
            ps.setString(7,candidats.getPays());

            ps.execute();

            con.connect().commit();
            ps.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void Supprimer_candidat(Candidats candid) {

    }

    @Override
    public void Modifier_candidat(Candidats candid) {

    }

    @Override
    public void Lister_candidat(Candidats candid) {

    }
}
