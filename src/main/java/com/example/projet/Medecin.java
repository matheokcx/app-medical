// src/main/java/com/example/projetmedical/Medecin.java
package com.example.projet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Medecin extends Individu implements Recherchable<Medecin> {
    private String specialisation;
    private List<Patient> patients;

    public Medecin(String id, String nom, String prenom, LocalDate dateNaissance, String specialisation) {
        super(id, nom, prenom, dateNaissance);
        this.specialisation = specialisation;
        this.patients = new ArrayList<>();
    }

    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    public void supprimerPatient(Patient patient) {
        patients.remove(patient);
    }

    @Override
    public List<Medecin> rechercheParNom(String nom) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public List<Medecin> rechercheParSpecialisation(String specialisation) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public List<Medecin> rechercheGenerale(String critere) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public List<Medecin> filtrerParDate(LocalDate date) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public List<Medecin> trierParNom(boolean ascendant) {
        // Implementation details
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + ", specialisation='" + specialisation + '\'' + ", patients=" + patients;
    }
}
