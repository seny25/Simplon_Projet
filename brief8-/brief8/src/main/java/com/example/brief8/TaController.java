package com.example.brief8;

import PackDao.DaoUtilisateur;
import com.clas.Conexion;
import com.clas.Taches;
import com.clas.Utilisateurs;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.util.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TaController implements Initializable {
    DaoUtilisateur instance=new DaoUtilisateur();

    @FXML
    private Button btnModifier;

    @FXML
    private Button btnSupprimer;

    @FXML
    private Label description;

    @FXML
    private TableColumn<Taches, String> descriptionTa;

    @FXML
    private Label nom_categorie;

    @FXML
    private TableColumn<Taches, String> nom_categorieTa;

    @FXML
    private Label status;



    @FXML
    private TableColumn<Taches, String> statusTa;
    @FXML private Label deadline;
    @FXML
    private TableColumn<Taches, String> deadlineTa;
    @FXML
    private TableView<Taches> tableauT;

    @FXML
    private Label titre;

    @FXML
    private TableColumn<Taches, String> titreTa;

    @FXML
    void Ajouter(ActionEvent event) throws SQLException {
        instance.Ajouter(titre.getText(),description.getText(),status.getText(),nom_categorie.getText(),deadline.getText());
        AfficherTaches();

    }

    @FXML
    void Modifier(ActionEvent event) {
    instance.Modifier(nom_categorie.getText());
    AfficherTaches();
    }

    @FXML
    void Supprimer(ActionEvent event) {
     instance.Supprimer(titre.getText());
     AfficherTaches();

    }
      public void AfficherTaches(){
          ObservableList<Taches> Liist =  instance.TList();
          titreTa.setCellValueFactory(new PropertyValueFactory<Taches,String>("titre"));
          descriptionTa.setCellValueFactory(new PropertyValueFactory<Taches,String>("description"));
          statusTa.setCellValueFactory(new PropertyValueFactory<Taches,String>("status"));
          nom_categorieTa.setCellValueFactory(new PropertyValueFactory<Taches,String>("nom_categorie"));
          deadlineTa.setCellValueFactory(new PropertyValueFactory<Taches,String>("deadline"));
          tableauT.setItems(Liist);

      }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
