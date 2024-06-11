package com.example.projet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe Medecin représente un médecin avec des attributs tels que l'identifiant, le nom, le prénom, la date de naissance,
 * la spécialisation et la liste des patients associés.
 */
public class Medecin extends Individu implements Recherchable<Medecin> {

    private String specialisation; // Spécialisation du médecin
    private List<Patient> patients; // Liste des patients associés au médecin

    /**
     * Constructeur de la classe Medecin.
     *
     * @param id             Identifiant du médecin.
     * @param nom            Nom du médecin.
     * @param prenom         Prénom du médecin.
     * @param dateNaissance  Date de naissance du médecin.
     * @param specialisation Spécialisation du médecin.
     */
    public Medecin(String id, String nom, String prenom, LocalDate dateNaissance, String specialisation) {
        super(id, nom, prenom, dateNaissance);
        this.specialisation = specialisation;
        this.patients = new ArrayList<>(); // Initialisation de la liste des patients
    }

    /**
     * Ajoute un patient à la liste des patients associés au médecin.
     *
     * @param patient Le patient à ajouter.
     */
    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    /**
     * Supprime un patient de la liste des patients associés au médecin.
     *
     * @param patient Le patient à supprimer.
     */
    public void supprimerPatient(Patient patient) {
        patients.remove(patient);
    }

    // Implémentation des méthodes de l'interface Recherchable<Medecin>

    /**
     * Recherche des médecins par leur nom.
     *
     * @param nom Le nom à rechercher.
     * @return Une liste des médecins correspondants.
     */
    @Override
    public List<Medecin> rechercheParNom(String nom) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Recherche des médecins par leur spécialisation.
     *
     * @param specialisation La spécialisation à rechercher.
     * @return Une liste des médecins correspondants.
     */
    @Override
    public List<Medecin> rechercheParSpecialisation(String specialisation) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Recherche générale des médecins par un critère donné.
     *
     * @param critere Le critère de recherche.
     * @return Une liste des médecins correspondants.
     */
    @Override
    public List<Medecin> rechercheGenerale(String critere) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Filtrage des médecins par date.
     *
     * @param date La date à utiliser pour le filtrage.
     * @return Une liste des médecins filtrés.
     */
    @Override
    public List<Medecin> filtrerParDate(LocalDate date) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Tri des médecins par nom.
     *
     * @param ascendant true pour un tri ascendant, false pour un tri descendant.
     * @return Une liste des médecins triés.
     */
    @Override
    public List<Medecin> trierParNom(boolean ascendant) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails du médecin.
     *
     * @return Une représentation sous forme de chaîne de caractères des détails du médecin.
     */
    @Override
    public String toString() {
        return super.toString() + ", specialisation='" + specialisation + '\'' + ", patients=" + patients;
    }
}
