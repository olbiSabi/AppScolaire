package GestionEtablisement;

public class Personne {
    public static int personne_Id = 0;
    public String nom;
    public String prenom;
    public String email;
    public String dateNaissance;
    public String lieuNaissance;
    public int telephoneDomicile;
    public int telephoneMobile;
    public String genre;

    public static int getPersonne_Id() {
        return personne_Id;
    }

    public static void setPersonne_Id(int personne_Id) {
        Personne.personne_Id = personne_Id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public int getTelephoneDomicile() {
        return telephoneDomicile;
    }

    public void setTelephoneDomicile(int telephoneDomicile) {
        this.telephoneDomicile = telephoneDomicile;
    }

    public int getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(int telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
