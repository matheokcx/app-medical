package com.example.projet;

import java.time.LocalDateTime;

/**
 * La classe RendezVous représente un rendez-vous entre un patient et un médecin à une date et heure spécifiques.
 */
public class RendezVous {

    private String id; // Identifiant du rendez-vous
    private Patient patient; // Patient concerné par le rendez-vous
    private Medecin medecin; // Médecin associé au rendez-vous
    private LocalDateTime dateHeure; // Date et heure du rendez-vous

    /**
     * Constructeur de la classe RendezVous.
     *
     * @param id         Identifiant du rendez-vous.
     * @param patient    Patient concerné par le rendez-vous.
     * @param medecin    Médecin associé au rendez-vous.
     * @param dateHeure  Date et heure du rendez-vous.
     */
    public RendezVous(String id, Patient patient, Medecin medecin, LocalDateTime dateHeure) {
        this.id = id;
        this.patient = patient;
        this.medecin = medecin;
        this.dateHeure = dateHeure;
    }

    /**
     * Retourne l'identifiant du rendez-vous.
     *
     * @return L'identifiant du rendez-vous.
     */
    public String getId() {
        return id;
    }

    /**
     * Définit l'identifiant du rendez-vous.
     *
     * @param id Le nouvel identifiant du rendez-vous.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retourne le patient concerné par le rendez-vous.
     *
     * @return Le patient concerné par le rendez-vous.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Définit le patient concerné par le rendez-vous.
     *
     * @param patient Le nouveau patient concerné par le rendez-vous.
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Retourne le médecin associé au rendez-vous.
     *
     * @return Le médecin associé au rendez-vous.
     */
    public Medecin getMedecin() {
        return medecin;
    }

    /**
     * Définit le médecin associé au rendez-vous.
     *
     * @param medecin Le nouveau médecin associé au rendez-vous.
     */
    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    /**
     * Retourne la date et heure du rendez-vous.
     *
     * @return La date et heure du rendez-vous.
     */
    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    /**
     * Définit la date et heure du rendez-vous.
     *
     * @param dateHeure La nouvelle date et heure du rendez-vous.
     */
    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    /**
     * Permet de reprogrammer le rendez-vous avec une nouvelle date et heure.
     *
     * @param nouvelleDate La nouvelle date et heure du rendez-vous.
     */
    public void reprogrammer(LocalDateTime nouvelleDate) {
        this.dateHeure = nouvelleDate;
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails du rendez-vous.
     *
     * @return Une représentation sous forme de chaîne de caractères des détails du rendez-vous.
     */
    @Override
    public String toString() {
        return "RendezVous{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", medecin=" + medecin +
                ", dateHeure=" + dateHeure +
                '}';
    }
}
