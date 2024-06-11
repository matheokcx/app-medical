package com.example.projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class OrdonnancesController {

    private static Stage fenetre;
    @FXML
    private Button retour;

    public static void setStage (Stage value){
        fenetre = value;
    }
    @FXML
    void RetourMenu(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        fenetre = (Stage) retour.getScene().getWindow();
        Scene scene = new Scene(root);
        fenetre.setScene(scene);
        fenetre.show();
    }

}
