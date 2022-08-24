package com.example.brief8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("Avant le chemin");
       Parent root= FXMLLoader.load(getClass().getResource("com/inscrire.fxml"));

        System.out.println("Apres le chemin");
        Scene scene = new Scene(root);
        stage.setTitle("salut!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}