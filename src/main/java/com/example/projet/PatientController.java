package com.example.projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
        String nom = entrerNom.getText();
        String prenom = entrerPrenom.getText();
        String id = entrerID.getText();
        String age = entrerAge.getText();

        // Valider les informations (exemple simple)
        if (nom.isEmpty() || prenom.isEmpty() || id.isEmpty() || age.isEmpty()) {
            showAlert("Erreur", "Veuillez remplir tous les champs.");
            return;
        }

        try {
            int ageInt = Integer.parseInt(age);
            // Simuler l'envoi de la requête (à remplacer par une requête réelle)
            boolean success = envoyerDonneesAuServeur(id, nom, prenom, ageInt);

            if (success) {
                showAlert("Succès", "Requête envoyée avec succès.");
            } else {
                showAlert("Erreur", "Échec de l'envoi de la requête.");
            }
        } catch (NumberFormatException e) {
            showAlert("Erreur", "L'âge doit être un nombre.");
        }
    }

    private boolean envoyerDonneesAuServeur(String id, String nom, String prenom, int age) {
        // Logique pour envoyer les données au serveur
        // Retourner vrai si la requête a réussi, faux sinon
        // Ici, on simule une requête réussie
        return true;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public void setStage(Stage val){
        stage = val;
    }
}