package fr.diginamic;

import fr.diginamic.dao.EmpruntDAO;
import fr.diginamic.dao.LivreDAO;
import fr.diginamic.exception.DAOException;
import fr.diginamic.services.*;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MediathequeApp2 {
    public static void main(String[] args) {
        LivreDAO livreDAO = new LivreDAO();
        EmpruntDAO empruntDAO = new EmpruntDAO();

        Scanner scanner = new Scanner(System.in);
        Map<Integer, MenuService> menu = new TreeMap<>();
        menu.put(1, new NouveauLivreMenuService());
        menu.put(3, new NouvelEmpruntMenuService());
        menu.put(4, new ListerLivreMenuService());
        menu.put(99, new QuitterMenuService());

        StringBuilder menuStringBuilder = new StringBuilder();

        for (Map.Entry<Integer, MenuService> entry : menu.entrySet()) {
            menuStringBuilder.append(entry.getKey()).append(". ").append(entry.getValue().intitule()).append("\n");
        }
        String menuString = menuStringBuilder.toString();

        int choix;
        do {
            System.out.println(menuString);

            System.out.print("CHOIX : ");
            choix = scanner.nextInt();
            scanner.nextLine();
            try {
                menu.get(choix).traiter(scanner, livreDAO, empruntDAO);
            } catch (DAOException e) {
                System.out.println(e);
            }
        } while (choix != 99);

        scanner.close();
    }
}
