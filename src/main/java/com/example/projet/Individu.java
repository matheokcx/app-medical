package com.example.projet;

import java.time.LocalDate;

/**
 * La classe Individu est une classe abstraite représentant une entité individuelle avec des attributs tels que l'identifiant, le nom, le prénom et la date de naissance.
 */
public abstract class Individu {

    private String id; // Identifiant de l'individu
    private String nom; // Nom de l'individu
    private String prenom; // Prénom de l'individu
    private LocalDate dateNaissance; // Date de naissance de l'individu

    /**
     * Constructeur de la classe Individu.
     *
     * @param id            Identifiant de l'individu.
     * @param nom           Nom de l'individu.
     * @param prenom        Prénom de l'individu.
     * @param dateNaissance Date de naissance de l'individu.
     */
    public Individu(String id, String nom, String prenom, LocalDate dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    /**
     * Retourne l'identifiant de l'individu.
     *
     * @return L'identifiant de l'individu.
     */
    public String getId() {
        return id;
    }

    /**
     * Définit l'identifiant de l'individu.
     *
     * @param id Le nouvel identifiant de l'individu.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retourne le nom de l'individu.
     *
     * @return Le nom de l'individu.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'individu.
     *
     * @param nom Le nouveau nom de l'individu.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'individu.
     *
     * @return Le prénom de l'individu.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom de l'individu.
     *
     * @param prenom Le nouveau prénom de l'individu.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne la date de naissance de l'individu.
     *
     * @return La date de naissance de l'individu.
     */
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Définit la date de naissance de l'individu.
     *
     * @param dateNaissance La nouvelle date de naissance de l'individu.
     */
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails de l'individu.
     *
     * @return Une représentation sous forme de chaîne de caractères des détails de l'individu.
     */
    @Override
    public String toString() {
        return "Individu{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
