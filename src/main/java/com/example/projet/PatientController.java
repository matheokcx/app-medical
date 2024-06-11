package com.example.projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientController {

    Stage stage;
    Scene scene;

    @FXML
    private Label age;

    @FXML
    private TextField entrerAge;

    @FXML
    private TextField entrerID;

    @FXML
    private TextField entrerNom;

    @FXML
    private TextField entrerPrenom;

    @FXML
    private Label id;

    @FXML
    private Label nom;

    @FXML
    private Label prenom;

    @FXML
    private Button envoyer;

    @FXML
    private Button retour;

    @FXML
    void RetourMenu(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        stage = (Stage) retour.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void envoyerRequete(ActionEvent event) {

    }

    public void setStage(Stage val){
        stage = val;
    }
}