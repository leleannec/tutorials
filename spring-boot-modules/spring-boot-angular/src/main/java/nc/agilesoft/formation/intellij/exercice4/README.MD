
Objectifs de l'exercice :
- live templates
- file templates
- formattage de code
- optimiser les imports
- save actions

Live templates

- Insérer un live template
  - Ouvrir la classe Batiment (CTRL+N bat)
  - Ajouter une constante publique (taper "psf") public static final int C1 = 1;
  - Ajouter une constante publique String (taper "psfs") public static final String C2 = "2";
  - Voir les autres live templates existant (CTRL+J)

- Créer un nouveau live template
  - Dans la classe Batiment, sélectionner : System.out.println("Hello world 1")
  - SHIFT+CTRL+A Save as live template
  - Choisir "hw" comme abbréviation
  - Aller dans le code Java, tester "hw" pour insérer rapidement

- Live template avec variable
    - Dans la classe Batiment, sélectionner : System.out.println("Hello world 1")
    - SHIFT+CTRL+A Save as live template
    - Choisir "hwn" comme abbréviation
    - Changer le template text : java.lang.System.out.println("Hello world $n$ / Bonjour $n$");
    - Edit variable pour préciser n
    - exercice : créer un live template pour accélérer l'écriture de lignes comme :
      - exemple : public static final String ROLE_<role> = "<role>";
      - exemple : public static final String ROLE_ADMIN = "ADMIN";
        tip : public static final String ROLE_$role$ = "$role$";    

- File templates

SHIFT+CTRL+A File templates : lister les files templates
Ou bien
Menu > File > New

Exercice :
- modifier le file template d'une classe Java, pour ajouter : créé par <utilisateur> le <date>
- créer une nouvelle classe FileTemplateDemo pour vérifier le bon fonctionnement
