package fr.diginamic.entity;

public class Livre {

    private int code;
    private String titre;
    private String auteur;
    private String genre;

    private int stock;

    public Livre() {}

    public Livre(int code, String titre, String auteur, String genre, int stock) {
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.stock = stock;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "code=" + code +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", genre='" + genre + '\'' +
                ", stock=" + stock +
                '}';
    }
}
