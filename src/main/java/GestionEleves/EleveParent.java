package GestionEleves;

import GestionEtablisement.Personne;

public class EleveParent extends Personne {
    public String fonction;

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}
