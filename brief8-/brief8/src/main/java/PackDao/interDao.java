package PackDao;


import com.clas.Taches;
import com.clas.Utilisateurs;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface interDao {

        public void Ajouter(String titre,String description,String status,String nom_categorie,String deadline) throws SQLException;

    public void Supprimer( String titre);

    public void Modifier(String nom_categorie);

    public ObservableList<Taches> TList();


}
