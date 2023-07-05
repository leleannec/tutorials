

Objectifs :
- créer une classe Java, avec un main
- lancer l'application en mode run ou debug
- générer du code automatique (constructeur, toString, getters, etc.)
- copier-coller une classe pour la modifier
- rechercher/remplacer
- renommer
- structurer les packages


Actions

- Créer une nouvelle classe Java "Personne"
(bouton droit -> New Java Class)
- Ajouter un main (taper main et laisser l'éditeur proposer)
- Ajouter l'instruction : System.out.println("Hello world");
- Démarrer le programme (clic triangle vert)

- Ajouter les instructions dans le main
        System.out.println("Hello world 2");
        System.out.println("Hello world 3");

- Mettez un point d'arrêt en début de main()
- Lancer l'application en mode debug, et exécuter pas à pas

Génération de code
- Ajouter attributs nom/prénom/date de naissance (taper à la main pour voir les aides intellij)

  private String nom;
  private String prenom;
  private LocalDate dateNaissance;

- Générer un constructeur 
proposé : taper SHIFT+CTRL+A constructor, sélectionner les 3 champs

- Générer toString
proposé : taper "tos" et laisser intellij proposer

- Générer equals/hashCode de manière similaire

- Générer getters/setters
proposé : Alt+Ins, choisir getter and setter

- Générer un test
proposé : Alt+Ins et choisir Test
générer une méthode de test pour la méthode toString
lancer le test (vide) -> il est vert

- Copier la classe Personne vers une classe Batiment
- Ajouter javadoc au niveau du constructeur
  Proposé : se placer sur le constructeur, et appuyer sur ALT+ENTREE


Rechercher / remplacer

- Il reste des chaines "Personne" dans la classe Batiment. Renommer (CTRL+F).
  - Expérimenter la fonction "Preserve Case" (très utile!) pour gérer la casse.

- Remplacer "batiment" par "batiment2" dans tout le projet, uniquement sur les fichiers Java
  - utiliser "replace in files" (SHIFT+CTRL+A replace in files) 

- Annuler le rechercher/remplacer : Undo (CTRL+Z)

- Remplacer par expression régulière

  - Classe personne : rechercher/remplacer l'expression régulière
  - Hello ([^"]*)
  - par : bonjour $1 !
  - IntelliJ propose un aperçu  (tester avec/sous le "preserve case")

Renommages

- Renommer dateNaissance en dateConstruction (Refactoring renommer, MAJ+F6)
- Renommer le champ prenom en description (Refactoring, MAJ+F6)

Structurer les packages

- Créer un sous-package "rhum"
- Déplacer Personne sous "rhum" (drag & drop souris)
- Renommer le package en "rh" (MAJ+F6)
