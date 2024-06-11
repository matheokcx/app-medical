package com.example.projet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * La classe HelloApplication est une classe principale de l'application JavaFX.
 * Elle est responsable du démarrage de l'application et de l'affichage de la fenêtre principale.
 */
public class HelloApplication extends Application {

    /**
     * Méthode de démarrage de l'application JavaFX.
     *
     * @param stage La fenêtre principale de l'application.
     * @throws IOException Si une erreur survient lors du chargement du fichier FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Dashboard");
        stage.setScene(scene);

        HelloController controller = fxmlLoader.getController();
        controller.setStage(stage);

        stage.show();
    }

    /**
     * Méthode principale permettant de lancer l'application.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        launch(); // Lancement de l'application JavaFX
    }
}
