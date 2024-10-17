package fr.diginamic.entity;

import java.util.Date;

public class Emprunt {
    private static final int DUREE_MAXIMALE = 21;

    private Livre livre;
    private Date dateEmprunt;
    private Date dateRetour;

    public Emprunt() {}

    public Emprunt(Date dateEmprunt, Livre livre) {
        this.dateEmprunt = dateEmprunt;
        this.livre = livre;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "livre=" + livre +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetour=" + dateRetour +
                '}';
    }
}
