// src/main/java/com/example/projetmedical/Patient.java
package _MedicalApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Patient extends Individu implements Recherchable<Patient> {
    private List<String> dossierMedical;

    public Patient(String id, String nom, String prenom, LocalDate dateNaissance) {
        super(id, nom, prenom, dateNaissance);
        this.dossierMedical = new ArrayList<>();
    }

    public void ajouterVisite(String notes, LocalDate date) {
        dossierMedical.add(date + ": " + notes);
    }

    public void afficherHistorique() {
        for (String visite : dossierMedical) {
            System.out.println(visite);
        }
    }

    @Override
    public List<Patient> rechercheParNom(String nom) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public List<Medecin> rechercheParSpecialisation(String specialisation) {
        // Implementation not applicable
        return new ArrayList<>();
    }

    @Override
    public List<Patient> rechercheGenerale(String critere) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public List<Patient> filtrerParDate(LocalDate date) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public List<Patient> trierParNom(boolean ascendant) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + ", dossierMedical=" + dossierMedical;
    }
}
