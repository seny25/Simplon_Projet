package com.example.brief8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public Label nomutilisateur;
    private Stage stage;
    private Parent root;
    private Scene scene;

//Connexion
    @FXML
    private Button Connexion;

    @FXML
    private Button inscrire;

    @FXML
    private Label motpass;

    @FXML
    private AnchorPane nom_utilisateur;

    @FXML
    private TextField txtUtilisateur;

    @FXML
    private TextField txtmotpass;

    @FXML
    private Label txtnom_utilisateur;

    @FXML
    void btnConnexion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


//s'inscrire



    @FXML
    private Label nom;



    @FXML
    private Label prenom;

    @FXML
    private TextField txtmotpasst;

    @FXML
    private TextField txtnom_utilisateurt;

    @FXML
    private TextField txtnomt;

    @FXML
    private TextField txtprenomt;

    @FXML
    void btninscrire(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tach.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}