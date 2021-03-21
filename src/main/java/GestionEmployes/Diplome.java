package GestionEmployes;

public class Diplome {
    public static int diplome_id = 0;
    public String designation;
    public String dateObtention;
    public String lieuObtention;
    public String mention;
    public float note;

    public static int getDiplome_id() {
        return diplome_id;
    }

    public static void setDiplome_id(int diplome_id) {
        Diplome.diplome_id = diplome_id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }

    public String getLieuObtention() {
        return lieuObtention;
    }

    public void setLieuObtention(String lieuObtention) {
        this.lieuObtention = lieuObtention;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
