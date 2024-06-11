package com.example.projet;

import java.util.List;

/**
 * La classe Facture représente une facture associée à un patient, contenant des détails sur les services fournis et le coût total.
 */
public class Facture {

    private String id; // Identifiant de la facture
    private Patient patient; // Patient associé à la facture
    private List<String> detailsServices; // Liste des détails des services fournis
    private double coutTotal; // Coût total de la facture
    private boolean paiement; // Indique si la facture a été payée

    /**
     * Constructeur de la classe Facture.
     *
     * @param id              Identifiant de la facture.
     * @param patient         Patient associé à la facture.
     * @param detailsServices Liste des détails des services fournis.
     * @param coutTotal       Coût total de la facture.
     */
    public Facture(String id, Patient patient, List<String> detailsServices, double coutTotal) {
        this.id = id;
        this.patient = patient;
        this.detailsServices = detailsServices;
        this.coutTotal = coutTotal;
        this.paiement = false; // Par défaut, la facture n'est pas payée.
    }

    /**
     * Affiche les détails de la facture.
     */
    public void afficherFacture() {
        System.out.println(this);
    }

    /**
     * Applique une remise sur le coût total de la facture.
     *
     * @param pourcentage Le pourcentage de remise à appliquer.
     */
    public void appliquerRemise(double pourcentage) {
        this.coutTotal -= this.coutTotal * (pourcentage / 100);
    }

    /**
     * Enregistre un paiement partiel ou total de la facture.
     *
     * @param montant Le montant du paiement.
     */
    public void recevoirPaiement(double montant) {
        if (montant >= coutTotal) {
            this.paiement = true;
        }
    }

    /**
     * Vérifie le statut de paiement de la facture.
     *
     * @return true si la facture est payée, sinon false.
     */
    public boolean verifierStatutPaiement() {
        return this.paiement;
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails de la facture.
     *
     * @return Une représentation sous forme de chaîne de caractères des détails de la facture.
     */
    @Override
    public String toString() {
        return "Facture{" +
                "id='" + id + '\'' +
                ", patient=" + patient +
                ", detailsServices=" + detailsServices +
                ", coutTotal=" + coutTotal +
                ", paiement=" + paiement +
                '}';
    }
}
