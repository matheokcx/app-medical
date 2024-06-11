package com.example.projet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe Patient représente un patient avec des attributs tels que l'identifiant, le nom, le prénom, la date de naissance
 * et un dossier médical contenant l'historique des visites.
 */
public class Patient extends Individu implements Recherchable<Patient> {

    private List<String> dossierMedical; // Dossier médical du patient contenant l'historique des visites

    /**
     * Constructeur de la classe Patient.
     *
     * @param id            Identifiant du patient.
     * @param nom           Nom du patient.
     * @param prenom        Prénom du patient.
     * @param dateNaissance Date de naissance du patient.
     */
    public Patient(String id, String nom, String prenom, LocalDate dateNaissance) {
        super(id, nom, prenom, dateNaissance);
        this.dossierMedical = new ArrayList<>(); // Initialisation du dossier médical
    }

    /**
     * Ajoute une visite avec des notes à l'historique du dossier médical du patient.
     *
     * @param notes Les notes de la visite.
     * @param date  La date de la visite.
     */
    public void ajouterVisite(String notes, LocalDate date) {
        dossierMedical.add(date + ": " + notes);
    }

    /**
     * Affiche l'historique des visites du patient.
     */
    public void afficherHistorique() {
        for (String visite : dossierMedical) {
            System.out.println(visite);
        }
    }

    // Implémentation des méthodes de l'interface Recherchable<Patient>

    /**
     * Recherche des patients par leur nom.
     *
     * @param nom Le nom à rechercher.
     * @return Une liste des patients correspondants.
     */
    @Override
    public List<Patient> rechercheParNom(String nom) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Recherche des patients par leur spécialisation.
     * Cette méthode n'est pas applicable pour la classe Patient.
     *
     * @param specialisation La spécialisation à rechercher.
     * @return Une liste vide (aucune correspondance).
     */
    @Override
    public List<Medecin> rechercheParSpecialisation(String specialisation) {
        // Implémentation non applicable
        return new ArrayList<>();
    }

    /**
     * Recherche générale des patients par un critère donné.
     *
     * @param critere Le critère de recherche.
     * @return Une liste des patients correspondants.
     */
    @Override
    public List<Patient> rechercheGenerale(String critere) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Filtrage des patients par date.
     *
     * @param date La date à utiliser pour le filtrage.
     * @return Une liste des patients filtrés.
     */
    @Override
    public List<Patient> filtrerParDate(LocalDate date) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Tri des patients par nom.
     *
     * @param ascendant true pour un tri ascendant, false pour un tri descendant.
     * @return Une liste des patients triés.
     */
    @Override
    public List<Patient> trierParNom(boolean ascendant) {
        // Implémentation des détails
        return new ArrayList<>();
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails du patient.
     *
     * @return Une représentation sous forme de chaîne de caractères des détails du patient.
     */
    @Override
    public String toString() {
        return super.toString() + ", dossierMedical=" + dossierMedical;
    }
}
