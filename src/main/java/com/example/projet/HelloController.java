package com.example.projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    Stage stage;

    public void setStage(Stage value){
        stage = value;
    }
    @FXML
    private Button gestionMedecin;

    @FXML
    private Button gestionPatient;

    @FXML
    void buttonPatient(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vuePatient.fxml"));
        Parent viewContent = fxmlLoader.load();

        PatientController patientController = fxmlLoader.getController();
        patientController.setStage(stage);

        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
    }

}