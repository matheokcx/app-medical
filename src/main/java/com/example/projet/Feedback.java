// src/main/java/com/example/projetmedical/Feedback.java
package _MedicalApp;

import java.time.LocalDate;

public class Feedback {
    private String id;
    private String patientId;
    private String medecinId;
    private LocalDate dateConsultation;
    private String commentaire;
    private int note;

    public Feedback(String id, String patientId, String medecinId, LocalDate dateConsultation, String commentaire, int note) {
        this.id = id;
        this.patientId = patientId;
        this.medecinId = medecinId;
        this.dateConsultation = dateConsultation;
        this.commentaire = commentaire;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getMedecinId() {
        return medecinId;
    }

    public LocalDate getDateConsultation() {
        return dateConsultation;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void mettreAJourCommentaire(String nouveauCommentaire) {
        this.commentaire = nouveauCommentaire;
    }

    public int getNote() {
        return note;
    }

    public void ajouterNote(int nouvelleNote) {
        this.note = nouvelleNote;
    }

    public void signalerProbleme() {
        // Implementation details for problem reporting
    }

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
