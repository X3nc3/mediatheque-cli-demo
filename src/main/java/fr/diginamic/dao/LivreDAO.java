package fr.diginamic.dao;

import fr.diginamic.entity.Livre;
import fr.diginamic.exception.DAOException;

import java.util.ArrayList;
import java.util.List;

public class LivreDAO {
    private final List<Livre> livres = new ArrayList<>();

    {
        livres.add(new Livre(1, "Les Misérables", "Victor Hugo", "Roman", 10));
        livres.add(new Livre(2, "Le Comte de Monte-Cristo", "Alexandre Dumas", "Aventure", 15));
        livres.add(new Livre(3, "La Peste", "Albert Camus", "Roman", 8));
        livres.add(new Livre(4, "1984", "George Orwell", "Science-fiction", 20));
        livres.add(new Livre(5, "L'étranger", "Albert Camus", "Philosophie", 12));
        livres.add(new Livre(6, "Le Petit Prince", "Antoine de Saint-Exupéry", "Conte", 25));
        livres.add(new Livre(7, "Crime et Châtiment", "Fiodor Dostoïevski", "Roman", 9));
        livres.add(new Livre(8, "Germinal", "Émile Zola", "Roman", 18));
        livres.add(new Livre(9, "Le Seigneur des Anneaux", "J.R.R. Tolkien", "Fantasy", 5));
        livres.add(new Livre(10, "Harry Potter à l'école des sorciers", "J.K. Rowling", "Fantasy", 30));
        livres.add(new Livre(11, "La Métamorphose", "Franz Kafka", "Nouvelle", 11));
        livres.add(new Livre(12, "Don Quichotte", "Miguel de Cervantes", "Aventure", 13));
        livres.add(new Livre(13, "Madame Bovary", "Gustave Flaubert", "Roman", 16));
        livres.add(new Livre(14, "Moby Dick", "Herman Melville", "Aventure", 14));
        livres.add(new Livre(15, "Fahrenheit 451", "Ray Bradbury", "Science-fiction", 9));
        livres.add(new Livre(16, "Le Parfum", "Patrick Süskind", "Roman", 22));
        livres.add(new Livre(17, "L'île mystérieuse", "Jules Verne", "Aventure", 19));
        livres.add(new Livre(18, "Les Fleurs du mal", "Charles Baudelaire", "Poésie", 17));
        livres.add(new Livre(19, "Dracula", "Bram Stoker", "Horreur", 6));
        livres.add(new Livre(20, "Les Trois Mousquetaires", "Alexandre Dumas", "Aventure", 8));
        livres.add(new Livre(21, "Jane Eyre", "Charlotte Brontë", "Roman", 7));
        livres.add(new Livre(22, "Bel-Ami", "Guy de Maupassant", "Roman", 15));
        livres.add(new Livre(23, "Le Rouge et le Noir", "Stendhal", "Roman", 14));
        livres.add(new Livre(24, "Robinson Crusoé", "Daniel Defoe", "Aventure", 12));
        livres.add(new Livre(25, "L'illusion comique", "Pierre Corneille", "Théâtre", 10));
        livres.add(new Livre(26, "Le Meilleur des mondes", "Aldous Huxley", "Science-fiction", 8));
        livres.add(new Livre(27, "Le vieil homme et la mer", "Ernest Hemingway", "Roman", 9));
        livres.add(new Livre(28, "Le Nom de la Rose", "Umberto Eco", "Roman", 11));
        livres.add(new Livre(29, "Dune", "Frank Herbert", "Science-fiction", 5));
        livres.add(new Livre(30, "Voyage au centre de la Terre", "Jules Verne", "Aventure", 7));
    }

    public void enregistrerLivre(Livre livre) {
        this.livres.add(livre);
    }

    public List<Livre> recupererLivres() {
        return livres;
    }

    public Livre recupererUnLivreParSonCode(int codeLivre) throws DAOException {
        for (Livre livre: livres) {
            if (livre.getCode() == codeLivre) {
                return livre;
            }
        }
        throw new DAOException("Code livre non trouvé");
    }
}
