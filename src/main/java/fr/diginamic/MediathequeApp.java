package fr.diginamic;

import fr.diginamic.dao.EmpruntDAO;
import fr.diginamic.dao.LivreDAO;
import fr.diginamic.exception.DAOException;
import fr.diginamic.services.*;

import java.util.Scanner;

public class MediathequeApp {
    public static void main(String[] args) {
        LivreDAO livreDAO = new LivreDAO();
        EmpruntDAO empruntDAO = new EmpruntDAO();

        Scanner scanner = new Scanner(System.in);
        String Menu = """
                1. Enregistrer un nouveau Livre
                2. Supprimer un Livre
                3. Enregistrer un Emprunt
                4. Retourner un livre
                5. Listes des Livres
                99. Quitter
                """;

        int choix;
        do {
            System.out.println(Menu);

            System.out.print("CHOIX : ");
            choix = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (choix) {
                    case 1:
                        MenuService nouveauLivreMenuService = new NouveauLivreMenuService();
                        nouveauLivreMenuService.traiter(scanner, livreDAO, empruntDAO);
                        break;

                    case 2:
                        MenuService supprimerLivreMenuService = new SupprimerLivreMenuService();
                        supprimerLivreMenuService.traiter(scanner, livreDAO, empruntDAO);
                        break;

                    case 3:
                        MenuService nouvelEmpruntMenuService = new NouvelEmpruntMenuService();
                        nouvelEmpruntMenuService.traiter(scanner, livreDAO, empruntDAO);
                        break;
                    case 4:
                        // TODO

                    case 5:
                        MenuService listerLivreMenuService = new ListerLivreMenuService();
                        listerLivreMenuService.traiter(scanner, livreDAO, empruntDAO);
                        break;

                    default:
                        System.out.println("Ce choix n'est pas disponible");
                }
            } catch (DAOException e) {
                System.out.println(e);
            }
        } while (choix != 99);

        scanner.close();
    }
}
