# Demo - Mediatheque CLI

Le projet `mediatheque-cli` est un mini-projet Java conçu pour démontrer l'application pratique des principes de programmation orientée objet (POO). Ce programme simule une interface en ligne de commande pour la gestion d'une médiathèque, permettant aux utilisateurs de gérer des livres, des CD, des DVD, etc.

Certaines fonctionnalités ont été intentionnellement omises pour donner aux étudiants l'opportunité de développer leurs compétences en implémentant des fonctionnalités supplémentaires.

## Contexte
Ce projet a été développé dans le cadre d'un cours sur les concepts orientés objet en Java chez [@DiginamicFormation](https://github.com/DiginamicFormation)]. Il vise à fournir aux étudiants une expérience concrète pour comprendre comment les principes de POO peuvent être utilisés pour structurer un logiciel complexe de manière intuitive et maintenable.

## Fonctionnalités implémentées
- **Ajout d'un livre :** Permet aux utilisateurs d'ajouter de nouveaux livres à la collection.
- **Affichage des livres :** Affiche tous les livres disponibles dans la médiathèque.
- **Enregistrer un emprunt :** Permet d'enregistré l'emprunt d'un livre.

## Exemples de fonctionnalités à implémenter pour pratiquer

- **Gérer d'autres types de ressources :** Permettre aux utilisateurs d'enregistrer et d'emprunter différents types de ressources comme les CD et les DVD. Ce module étend l'utilisation de l'abstraction et peut introduire des interfaces ou des classes abstraites pour gérer différentes catégories de ressources.
- **Gérer les clients de la médiathèque et leurs abonnements :** Développer des fonctionnalités pour enregistrer de nouveaux clients, gérer les paiements des abonnements et associer un client à l'emprunt d'un livre. Cette fonctionnalité implique l'utilisation de l'encapsulation et des associations entre classes.
- **Historique des emprunts :** Ajouter la capacité de voir l'historique des emprunts pour chaque livre ou client. Cela permettra de travailler avec des collections et la manipulation de données complexes.
- **Recherche avancée de livres :** Implémenter des options de recherche avancée par genre, auteur, ou année de publication. Utilise les concepts de polymorphisme et de surcharge de méthodes pour diversifier les critères de recherche.
- ...

Chaque fonctionnalité supplémentaire est conçue pour renforcer la compréhension et l'application des principes de la programmation orientée objet, en ajoutant de la complexité de manière graduelle.

## Technologies utilisées
- **Java :** Le cœur du projet est écrit en Java, mettant en évidence l'utilisation des classes, de l'héritage, des interfaces et de la gestion des exceptions.
- **Maven :** Utilisé pour la gestion des dépendances et la construction du projet.

## Comment utiliser
Pour utiliser ce projet, vous devez avoir Java et Maven installés sur votre machine. Clonez ce dépôt, naviguez dans le répertoire du projet, et exécutez `mvn clean install` suivi de `java -jar target/mediatheque-cli.jar` pour démarrer l'application.
