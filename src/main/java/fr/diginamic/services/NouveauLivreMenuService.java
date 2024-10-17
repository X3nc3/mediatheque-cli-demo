package fr.diginamic.services;

import fr.diginamic.dao.EmpruntDAO;
import fr.diginamic.dao.LivreDAO;
import fr.diginamic.entity.Livre;
import fr.diginamic.exception.DAOException;

import java.util.Scanner;

public class NouveauLivreMenuService extends MenuService {

    @Override
    public String intitule() {
        return "Enregistrer un nouveau Livre";
    }

    @Override
    public void traiter(Scanner scanner, LivreDAO livreDAO, EmpruntDAO empruntDAO) {
        Livre livre = new Livre();

        System.out.print("Code : ");
        livre.setCode(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Titre : ");
        livre.setTitre(scanner.nextLine());

        System.out.print("Auteur : ");
        livre.setAuteur(scanner.nextLine());

        System.out.print("Genre : ");
        livre.setGenre(scanner.nextLine());

        System.out.print("Stock : ");
        livre.setStock(scanner.nextInt());
        scanner.nextLine();


        System.out.println(livre);

        livreDAO.enregistrerLivre(livre);
    }
}
