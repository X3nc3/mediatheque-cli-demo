package fr.diginamic.services;

import fr.diginamic.dao.EmpruntDAO;
import fr.diginamic.dao.LivreDAO;
import fr.diginamic.exception.DAOException;

import java.util.Scanner;

public class QuitterMenuService extends MenuService {
    @Override
    public String intitule() {
        return "Quitter";
    }

    @Override
    public void traiter(Scanner scanner, LivreDAO livreDAO, EmpruntDAO empruntDAO) throws DAOException {

    }
}
