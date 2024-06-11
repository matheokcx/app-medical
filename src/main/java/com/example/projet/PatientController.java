package com.example.projet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Le contrôleur PatientController gère les interactions avec la vue de gestion des patients de l'application.
 */
public class PatientController {

    private ArrayList<Patient> patients = new ArrayList<>();

    private Stage stage; // Référence à la scène principale de l'application
    private Scene scene; // Référence à la scène de la vue de gestion des patients

    @FXML
    private Button envoyer;

    @FXML
    private Button retour;

    /**
     * Méthode appelée lors du clic sur le bouton de retour au menu principal.
     *
     * @param event L'événement associé au clic sur le bouton de retour.
     * @throws IOException Si une erreur survient lors du chargement de la vue principale.
     */
    @FXML
    void RetourMenu(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        stage = (Stage) retour.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Méthode appelée lors du clic sur le bouton d'envoi de la requête.
     *
     * @param event L'événement associé au clic sur le bouton d'envoi de la requête.
     */
    @FXML
    void envoyerRequete(ActionEvent event) {
        /*String nom = entrerNom.getText();
        //String prenom = entrerPrenom.getText();
        //String id = entrerID.getText();
        //String age = entrerAge.getText();

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
        }*/
    }

    /**
     * Méthode pour envoyer les données au serveur.
     *
     * @param id     L'identifiant du patient.
     * @param nom    Le nom du patient.
     * @param prenom Le prénom du patient.
     * @param age    L'âge du patient.
     * @return true si la requête est envoyée avec succès, false sinon.
     */
    private boolean envoyerDonneesAuServeur(String id, String nom, String prenom, int age) {
        // Logique pour envoyer les données au serveur
        // Retourner vrai si la requête a réussi, faux sinon
        // Ici, on simule une requête réussie
        return true;
    }

    /**
     * Méthode pour afficher une boîte de dialogue d'alerte avec le titre et le message spécifiés.
     *
     * @param title   Le titre de la boîte de dialogue.
     * @param message Le message à afficher dans la boîte de dialogue.
     */
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Méthode pour définir la scène principale de l'application.
     *
     * @param val La référence à la scène principale.
     */
    public void setStage(Stage val) {
        stage = val;
    }
}
