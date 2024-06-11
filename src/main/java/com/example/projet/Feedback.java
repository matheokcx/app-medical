package com.example.projet;

import java.time.LocalDate;

/**
 * La classe Feedback représente le feedback laissé par un patient après une consultation médicale.
 */
public class Feedback {

    private String id; // Identifiant du feedback
    private String patientId; // Identifiant du patient
    private String medecinId; // Identifiant du médecin concerné
    private LocalDate dateConsultation; // Date de la consultation
    private String commentaire; // Commentaire laissé par le patient
    private int note; // Note attribuée par le patient à la consultation

    /**
     * Constructeur de la classe Feedback.
     *
     * @param id               Identifiant du feedback.
     * @param patientId        Identifiant du patient.
     * @param medecinId        Identifiant du médecin concerné.
     * @param dateConsultation Date de la consultation.
     * @param commentaire      Commentaire laissé par le patient.
     * @param note             Note attribuée par le patient à la consultation.
     */
    public Feedback(String id, String patientId, String medecinId, LocalDate dateConsultation, String commentaire, int note) {
        this.id = id;
        this.patientId = patientId;
        this.medecinId = medecinId;
        this.dateConsultation = dateConsultation;
        this.commentaire = commentaire;
        this.note = note;
    }

    /**
     * Retourne l'identifiant du feedback.
     *
     * @return L'identifiant du feedback.
     */
    public String getId() {
        return id;
    }

    /**
     * Retourne l'identifiant du patient.
     *
     * @return L'identifiant du patient.
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Retourne l'identifiant du médecin.
     *
     * @return L'identifiant du médecin.
     */
    public String getMedecinId() {
        return medecinId;
    }

    /**
     * Retourne la date de la consultation.
     *
     * @return La date de la consultation.
     */
    public LocalDate getDateConsultation() {
        return dateConsultation;
    }

    /**
     * Retourne le commentaire laissé par le patient.
     *
     * @return Le commentaire laissé par le patient.
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Met à jour le commentaire laissé par le patient.
     *
     * @param nouveauCommentaire Le nouveau commentaire à attribuer.
     */
    public void mettreAJourCommentaire(String nouveauCommentaire) {
        this.commentaire = nouveauCommentaire;
    }

    /**
     * Retourne la note attribuée par le patient.
     *
     * @return La note attribuée par le patient.
     */
    public int getNote() {
        return note;
    }

    /**
     * Met à jour la note attribuée par le patient.
     *
     * @param nouvelleNote La nouvelle note à attribuer.
     */
    public void ajouterNote(int nouvelleNote) {
        this.note = nouvelleNote;
    }

    /**
     * Signale un problème lié à ce feedback.
     * (Méthode à implémenter en détail selon les besoins du système)
     */
    public void signalerProbleme() {
        // Implémentation des détails pour le signalement d'un problème
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails du feedback.
     *
     * @return Une représentation sous forme de chaîne de caractères des détails du feedback.
     */
    @Override
    public String toString() {
        return "Feedback{" +
                "id='" + id + '\'' +
                ", patientId='" + patientId + '\'' +
                ", medecinId='" + medecinId + '\'' +
                ", dateConsultation=" + dateConsultation +
                ", commentaire='" + commentaire + '\'' +
                ", note=" + note +
                '}';
    }
}
