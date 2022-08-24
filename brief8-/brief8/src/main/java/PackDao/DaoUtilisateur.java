package PackDao;

import com.clas.Conexion;
import com.clas.Taches;
import com.clas.Utilisateurs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoUtilisateur implements  interDao{

  Statement st;

Connection connection=Conexion.getConexion();

    @Override
    public void Ajouter(String titre, String description, String status, String nom_categorie, String deadline) throws SQLException {
     String query="insert into Taches values("+titre+",'"+description+"', '"+status+"','"+nom_categorie+"','"+deadline+"')";
try {

}catch (Exception e){
    st=connection.createStatement();
    st.executeUpdate(query);
    e.printStackTrace();
}
    }

    @Override
    public void Supprimer(String titre) {
    String query="delete from Taches where titre="+titre;
    try {
        st=connection.createStatement();
        st.executeUpdate(query);
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    @Override
    public void Modifier(String nom_categorie) {
     String query="update Taches set'"+nom_categorie+"'";
     try {
        st=connection.createStatement();
        st.executeUpdate(query);
     }catch (Exception e){
         e.printStackTrace();
     }
    }

    @Override
    public ObservableList <Taches > TList()  {
        Connection con=Conexion.getConexion();
        ObservableList<Taches> List= FXCollections.observableArrayList();
        String query="select * from Taches";
        ResultSet rs;

        try {
            Statement st = con.createStatement();
     rs=st.executeQuery(query);
     Taches taches;
     while (rs.next()){
       taches=new Taches(rs.getString("titre"), rs.getNString("description"),rs.getString("status"),rs.getString("" +
               "nom_categorie"),rs.getString("12/03/2020") );
       List.add(taches);
     }


        }catch (Exception e){
            e.printStackTrace();
        }


        return List;
    }

}
