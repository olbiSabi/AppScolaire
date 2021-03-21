package GestionEleves;

import GestionEtablisement.Personne;

public class EleveTuteur extends Personne {
    public String fonction;

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}
