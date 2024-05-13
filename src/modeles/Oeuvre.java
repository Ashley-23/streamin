package modeles;

public class Oeuvre {

    public int id;
    public String nom;
    public String description;
    public String acteurs[];
    public int age;
    public String bande_d_annonce;
    public int duree_download;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getActeurs() {
        return acteurs;
    }

    public void setActeurs(String[] acteurs) {
        this.acteurs = acteurs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBande_d_annonce() {
        return bande_d_annonce;
    }

    public void setBande_d_annonce(String bande_d_annonce) {
        this.bande_d_annonce = bande_d_annonce;
    }

    public int getDuree_download() {
        return duree_download;
    }

    public void setDuree_download(int duree_download) {
        this.duree_download = duree_download;
    }
}
