package com.example.projet;

import com.example.projet.MedecinController;
import com.example.projet.PatientController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Le contrôleur HelloController gère les interactions avec la vue principale de l'application.
 */
public class HelloController {

    private Stage stage; // Référence à la fenêtre principale de l'application

    /**
     * Méthode pour définir la fenêtre principale de l'application.
     *
     * @param value La référence de la fenêtre principale.
     */
    public void setStage(Stage value) {
        stage = value;
    }

    @FXML
    private Button gestionMedecin; // Bouton pour accéder à la gestion des médecins

    @FXML
    private Button gestionPatient; // Bouton pour accéder à la gestion des patients

    @FXML
    private Button gestionOrdo;

    @FXML
    private Button gestionRdv;

    @FXML
    void afficherOrdonnances(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vueOrdonnances.fxml"));
        Parent viewContent = fxmlLoader.load();

        OrdonnancesController ordoController = fxmlLoader.getController();
        OrdonnancesController.setStage(stage);

        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
    }

    @FXML
    void afficherRdv(ActionEvent event) {

    }

    /**
     * Méthode appelée lors du clic sur le bouton de gestion des patients.
     *
     * @param event L'événement associé au clic sur le bouton.
     * @throws IOException Si une erreur survient lors du chargement de la vue du patient.
     */
    @FXML
    void buttonPatient(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vuePatient.fxml"));
        Parent viewContent = fxmlLoader.load();

        PatientController patientController = fxmlLoader.getController();
        patientController.setStage(stage);

        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
    }

    @FXML
    void gestionMedecin(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vueMedecin.fxml"));
        Parent viewContent = fxmlLoader.load();

        MedecinController medecinController = fxmlLoader.getController();
        medecinController.setStage(stage);

        Scene scene = new Scene(viewContent);
        stage.setScene(scene);
    }
}
