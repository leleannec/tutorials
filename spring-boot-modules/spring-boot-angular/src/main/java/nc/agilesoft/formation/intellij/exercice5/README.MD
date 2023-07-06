- Consulter la hiérarchie de classes

    - Créer une classe Agent qui hérite de Personne  (utiliser ALT+ENTER Create subclass...)
    - Créer une classe AgentSecret qui hérite de Agent
    - Taper CTRL+H pour voir la hiérarchie de classes
    - Essayer les différentes actions possibles de la vue proposée par IntelliJ

- Consulter la hiérarchie des appels d’une méthode : qui appelle une méthode, qui appelle les méthodes qui appellent
  cette méthode, etc.

TODO

- Utilisation de Lombok

    - Activer le plugin Lombok (SHIFT+SHIFT Plugins)
    - Ajouter la dépendance maven (cf https://projectlombok.org/setup/maven) dans le pom.xml
    - Ouvrir la classe Personne
    - Ajouter @Getter @Setter en annotation sur la classe Personne
    - Supprimer les getter/setters de la classe
    - Regarder la structure de la classe (CTRL+F12) et voir que les getters/setters sont bien toujours disponibles

- Navigation vers les warnings et erreurs de compilation

    - Rechercher la chaine "methodeInvalide" dans tout le projet (SHIFT+CTRL+F)
    - Décommenter la méthode (CTRL+/)
    - Ouvrir la vue problems (SHIFT+CTRL+A problems)
    - Suivre les commentaires dans le code décommenté pour résoudre chaque ligne en erreur

- Tests unitaires : Génération de tests unitaires
  Exemple avec Junit : Stub, setUp (before) et tearDown (after)

    - Créer un test unitaire sur Personne (ALT+ENTREE > Create Test)
      pour la méthode calculateAgeADate
    - Taper assertThat() et ALT+ENTREE pour avoir les suggestions, choisir import static method... et
      org.assertj.core.api.Assertions.assertThat
    - Ajouter un test ok, un test ko
    - Lancer les tests
    - Vue tests : voir le test vert, et le test rouge avec sa stacktrace d'erreur
    - Essayer en mode Debug
    - Ajouter un @BeforeEach pour factoriser Personne personne = new Personne("NOM", "Jean", LocalDate.of(2000, 1, 1));


- Refactoring (Renommer, Déplacer, Extraire, Changer, Introduire, Remonter) et aperçu des principaux autres refactorings
  possibles

    - Refactorings les plus courants :
        - Rename (SHIFT+F6) :
            - exercice : renommer la classe Batiment en Construction
            - exercice : renommer la méthode calculateAgeADate en calculAgePourDate
            - exercice : renommer package solution en solutionexercice
        - Move File (F6)
            - exercice :
                - créer un sous-package rh  (...exercice5.rh)
                - déplacer la classe Personne dedans
        - Move Directory (F6) : choisir un répertoire et le déplacer
            - exercice :
                - créer un sous-package rh.batiment (...exercice5.rh.batiment)
                - déplacer le répertoire batiment directement sous exercice5
                - déplacer la classe Construction dans ce sous-package batiment (avec la souris ou F6)
        - Extraire une méthode
            - exercice :
                - sélectionner "System.out.println("Bonjour world 1");" (dans main)
                - cliquer sur extract method (CTRL+ALT+M)
        - Extraire une variable
            - exercice : en utilisant les refactorings automatiques intellij, travailler la méthode "x" :
                - lui donner un nom explicite
                - extraire des constantes
                - extraire une sous-méthode qui renvoie le nb de jour par an en fonction du caractère bissextile
                - optionnel : créer une classe AgentUtil et déplacer la logique de calcul dedans + faire un test
                  unitaire
        - Introduire un paramètre
            - exercice :
                - sélectionner 1 dans "Bonjour world 1"
                - refatoring introduce parameter, appeler numero
        - remonter une méthode dans la hiérarchie
            - exercice :
                - remonter la méthode calculConges (de AgentSecret) vers la super-classe Agent
                  (refactoring > pull up)
        - Inline :
            - exercice : inline de la variable "result" sur la méthode calculConges

        - Remove field, Safe delete :
            - exercice : sur AgentSecret, supprimer les éléments inutiles

        - Autres refactorings possibles plus avancés : à essayer! 
