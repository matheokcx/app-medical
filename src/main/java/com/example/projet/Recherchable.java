// src/main/java/com/example/projetmedical/Recherchable.java
package _MedicalApp;

import java.time.LocalDate;
import java.util.List;

public interface Recherchable<T> {
    List<T> rechercheParNom(String nom);
    List<Medecin> rechercheParSpecialisation(String specialisation);
    List<T> rechercheGenerale(String critere);
    List<T> filtrerParDate(LocalDate date);
    List<T> trierParNom(boolean ascendant);
}
