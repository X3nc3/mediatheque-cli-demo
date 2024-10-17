package fr.diginamic.services;

import fr.diginamic.dao.EmpruntDAO;
import fr.diginamic.dao.LivreDAO;
import fr.diginamic.exception.DAOException;


import java.util.Scanner;

public abstract class MenuService {

    public abstract String intitule();

    public abstract void traiter(Scanner scanner, LivreDAO livreDAO, EmpruntDAO empruntDAO) throws DAOException;
}
