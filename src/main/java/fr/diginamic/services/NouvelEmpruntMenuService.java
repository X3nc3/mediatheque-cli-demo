package fr.diginamic.services;

import fr.diginamic.dao.EmpruntDAO;
import fr.diginamic.dao.LivreDAO;
import fr.diginamic.entity.Emprunt;
import fr.diginamic.entity.Livre;
import fr.diginamic.exception.DAOException;

import java.util.Date;
import java.util.Scanner;

public class NouvelEmpruntMenuService extends MenuService {

    @Override
    public String intitule() {
        return "Enregistrer un Emprunt";
    }

    @Override
    public void traiter(Scanner scanner, LivreDAO livreDAO, EmpruntDAO empruntDAO) throws DAOException {
        Emprunt emprunt = new Emprunt();

        System.out.print("Code Livre : ");
        int codeLivre = scanner.nextInt();
        Livre livre = livreDAO.recupererUnLivreParSonCode(codeLivre);
        emprunt.setLivre(livre);
        scanner.nextLine();

        emprunt.setDateEmprunt(new Date());

        System.out.println(emprunt);
        empruntDAO.enregistrerEmprunt(emprunt);
    }
}
