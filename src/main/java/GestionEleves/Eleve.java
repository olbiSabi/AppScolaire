package GestionEleves;

import GestionEtablisement.Personne;

public class Eleve extends Personne {
    public boolean boursier;
    public String classe;

    public boolean isBoursier() {
        return boursier;
    }

    public void setBoursier(boolean boursier) {
        this.boursier = boursier;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
