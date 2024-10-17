package fr.diginamic.dao;

import fr.diginamic.entity.Emprunt;

import java.util.ArrayList;
import java.util.List;

public class EmpruntDAO {
    private final List<Emprunt> emprunts = new ArrayList<>();

    public void enregistrerEmprunt(Emprunt emprunt) {
        this.emprunts.add(emprunt);
    }
}
