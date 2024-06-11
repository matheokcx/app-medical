package com.example.projet;

import java.util.ArrayList;
import java.util.List;

public class Ordonnance {
    private String id;
    private RendezVous rdv;
    private List<String> medicaments = new ArrayList<>();

    public Ordonnance(String id, RendezVous rdv) {
        this.id = id;
        this.rdv = rdv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RendezVous getRdv() {
        return rdv;
    }

    public void setRdv(RendezVous rdv) {
        this.rdv = rdv;
    }

    public List<String> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(List<String> medicaments) {
        this.medicaments = medicaments;
    }

    @Override
    public String toString() {
        return "Ordonnance{" +
                "id='" + id + '\'' +
                ", rdv=" + rdv +
                ", medicaments=" + medicaments +
                '}';
    }
}
