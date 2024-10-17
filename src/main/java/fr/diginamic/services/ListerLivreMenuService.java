package fr.diginamic.services;

import fr.diginamic.dao.EmpruntDAO;
import fr.diginamic.dao.LivreDAO;
import fr.diginamic.entity.Livre;
import fr.diginamic.exception.DAOException;

import java.util.List;
import java.util.Scanner;

public class ListerLivreMenuService extends MenuService {

    @Override
    public String intitule() {
        return "Listes des Livres";
    }

    @Override
    public void traiter(Scanner scanner, LivreDAO livreDAO, EmpruntDAO empruntDAO) {
        List<Livre> livres = livreDAO.recupererLivres();
        for (Livre livre: livres) {
            System.out.println(livre);
        }
    }
}
