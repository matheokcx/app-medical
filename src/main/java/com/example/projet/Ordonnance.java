package com.example.projet;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Ordonnance représente une ordonnance associée à un rendez-vous médical et contenant une liste de médicaments prescrits.
 */
public class Ordonnance {

    private String id; // Identifiant de l'ordonnance
    private RendezVous rdv; // Rendez-vous médical associé à l'ordonnance
    private List<String> medicaments = new ArrayList<>(); // Liste des médicaments prescrits dans l'ordonnance

    /**
     * Constructeur de la classe Ordonnance.
     *
     * @param id  Identifiant de l'ordonnance.
     * @param rdv Rendez-vous médical associé à l'ordonnance.
     */
    public Ordonnance(String id, RendezVous rdv) {
        this.id = id;
        this.rdv = rdv;
    }

    /**
     * Retourne l'identifiant de l'ordonnance.
     *
     * @return L'identifiant de l'ordonnance.
     */
    public String getId() {
        return id;
    }

    /**
     * Définit l'identifiant de l'ordonnance.
     *
     * @param id Le nouvel identifiant de l'ordonnance.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retourne le rendez-vous médical associé à l'ordonnance.
     *
     * @return Le rendez-vous médical associé à l'ordonnance.
     */
    public RendezVous getRdv() {
        return rdv;
    }

    /**
     * Définit le rendez-vous médical associé à l'ordonnance.
     *
     * @param rdv Le nouveau rendez-vous médical associé à l'ordonnance.
     */
    public void setRdv(RendezVous rdv) {
        this.rdv = rdv;
    }

    /**
     * Retourne la liste des médicaments prescrits dans l'ordonnance.
     *
     * @return La liste des médicaments prescrits dans l'ordonnance.
     */
    public List<String> getMedicaments() {
        return medicaments;
    }

    /**
     * Définit la liste des médicaments prescrits dans l'ordonnance.
     *
     * @param medicaments La nouvelle liste des médicaments prescrits dans l'ordonnance.
     */
    public void setMedicaments(List<String> medicaments) {
        this.medicaments = medicaments;
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails de l'ordonnance.
     *
     * @return Une représentation sous forme de chaîne de caractères des détails de l'ordonnance.
     */
    @Override
    public String toString() {
        return "Ordonnance{" +
                "id='" + id + '\'' +
                ", rdv=" + rdv +
                ", medicaments=" + medicaments +
                '}';
    }
}
