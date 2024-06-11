package _MedicalApp;


import java.util.List;

public class Facture {
 private String id;
 private Patient patient;
 private List<String> detailsServices;
 private double coutTotal;
 private boolean paiement;

 public Facture(String id, Patient patient, List<String> detailsServices, double coutTotal) {
     this.id = id;
     this.patient = patient;
     this.detailsServices = detailsServices;
     this.coutTotal = coutTotal;
     this.paiement = false;
 }

 public void afficherFacture() {
     System.out.println(this);
 }

 public void appliquerRemise(double pourcentage) {
     this.coutTotal -= this.coutTotal * (pourcentage / 100);
 }

 public void recevoirPaiement(double montant) {
     if (montant >= coutTotal) {
         this.paiement = true;
     }
 }

 public boolean verifierStatutPaiement() {
     return this.paiement;
 }

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
