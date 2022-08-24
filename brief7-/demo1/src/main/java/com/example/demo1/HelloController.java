package com.example.demo1;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public String sql;
    public Conexion con;

    public imple imlementation = new imple();
    @FXML
    private Button Ajouter_candidat;

    @FXML
    private Button Lister_candidat;

    @FXML
    private Button Modifier_candidat;

    @FXML
    private Button Supprimer_candidat;

    @FXML
    private TextField adresse;

    @FXML
    private TableColumn<?, ?> id_candidat;

    @FXML
    private TextField id_candidate;

    @FXML
    private TextField mail;

    @FXML
    private TextField nom;

    @FXML
    private TextField pays;

    @FXML
    private TextField prenom;

    @FXML
    private TableView<?> table_candidat;

    @FXML
    private TextField ville;

    @FXML
    void Ajouter_candidat(Candidats candidats) {
        candidats.setId_candidats(Integer.parseInt(id_candidate.getText()));
        candidats.setNom(nom.getText());

        candidats.setPrenom(prenom.getText());

        candidats.setMail(mail.getText());

        candidats.setAdresse(adresse.getText());

        candidats.setVille(ville.getText());

        candidats.setPays(pays.getText());

        imlementation.Ajouter_candidat(candidats);
    }

    @FXML
    void Modifier_candidat(ActionEvent event) {

    }

    @FXML
    void Supprimer_candidat(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }


}