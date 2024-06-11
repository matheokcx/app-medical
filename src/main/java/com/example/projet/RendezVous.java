package com.example.projet;
import java.time.LocalDateTime;

public class RendezVous {
    private String id;
    private Patient patient;
    private Medecin medecin;
    private LocalDateTime dateHeure;

    public RendezVous(String id, Patient patient, Medecin medecin, LocalDateTime dateHeure) {
        this.id = id;
        this.patient = patient;
        this.medecin = medecin;
        this.dateHeure = dateHeure;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    public void reprogrammer(LocalDateTime nouvelleDate) {
        this.dateHeure = nouvelleDate;
    }

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
