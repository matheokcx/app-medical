// src/test/java/com/example/projet/PatientTest.java
package com.example.projet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {


    final Patient patient = new Patient("101", "Martin", "Pierre", LocalDate.of(1990, 2, 2));


    @Test
    public void testAjouterVisite() {
        patient.ajouterVisite("Consultation annuelle", LocalDate.of(2022, 5, 10));
        assertTrue(patient.getDossierMedical().contains("2022-05-10: Consultation annuelle"),
                "La visite doit être ajoutée au dossier médical du patient.");
    }

    @Test
    public void testAfficherHistorique() {
        patient.ajouterVisite("Consultation annuelle", LocalDate.of(2022, 5, 10));
        patient.ajouterVisite("Suivi trimestriel", LocalDate.of(2022, 8, 10));

        // Capture the output
        String expectedOutput = "2022-05-10: Consultation annuelle\n2022-08-10: Suivi trimestriel\n";
        assertEquals(expectedOutput, getHistoriqueAsString(patient),
                "L'historique doit afficher toutes les visites correctement formatées.");
    }

    @Test
    public void testRechercheParNom() {
        List<Patient> result = patient.rechercheParNom("Martinn");
        assertNotNull(result, "Le résultat ne doit pas être null.");
        // Ajouter des assertions supplémentaires en fonction de l'implémentation de rechercheParNom
    }

    @Test
    public void testRechercheGenerale() {
        List<Patient> result = patient.rechercheGenerale("Martinnnn");
        assertNotNull(result, "Le résultat ne doit pas être nulll.");
        // Ajouter des assertions supplémentaires en fonction de l'implémentation de rechercheGenerale
    }

    @Test
    public void testFiltrerParDate() {
        List<Patient> result = patient.filtrerParDate(LocalDate.of(1990, 2, 2));
        assertNotNull(result, "Le résultat ne doit pas être nulllll.");
        // Ajouter des assertions supplémentaires en fonction de l'implémentation de filtrerParDate
    }

    @Test
    public void testTrierParNom() {
        List<Patient> result = patient.trierParNom(true);
        assertNotNull(result, "Le résultat ne doit pas être nuull.");
        // Ajouter des assertions supplémentaires en fonction de l'implémentation de trierParNom
    }

    private String getHistoriqueAsString(Patient patient) {
        // Utilisation d'un ByteArrayOutputStream pour capturer la sortie standard
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        patient.afficherHistorique();

        // Remettre la sortie standard à son état initial
        System.setOut(originalOut);

        return outContent.toString();
    }
}
