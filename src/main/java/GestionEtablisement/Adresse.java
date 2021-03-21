package GestionEtablisement;

public class Adresse {
    public static int adresse_Id = 0;
    public String adresse;
    public String ville;
    public String pays;
    public String codePostal;

    public static void setAdresse_Id(int adresse_Id) {
        Adresse.adresse_Id = adresse_Id;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public static int getAdresse_Id() {
        return adresse_Id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getCodePostal() {
        return codePostal;
    }
}
