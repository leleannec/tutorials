Navigation dans le code

- Fermer tous les onglets
- Réouvrir la classe Batiment (uniquement au clavier)
  proposé : "CTRL+N Bat"
- Ajouter un commentaire dans la classe Personne
- Ajouter un commentaire dans la classe Batiment
- Fermer tous les onglets
- Revenir à la dernière modification : CTRL+SHIFT+BACK
- Revenir à la modification encore antérieure : CTRL+SHIFT+BACK
- aller sur la méthode main sur le code :
  System.out.println("Hello world 1");
  aller voir le contenu de println : CTRL+B ou bien clic + bouton gauche souris
  continuer à descendre : CTRL+B sur "writeln"
- pour "remonter" : CTRL+ALT+Flèche gauche
- pour "redescendre" de nouveau : CTRL+ALT+Flèche droite
- pour voir les derniers fichiers modifiés : Recent Files (CTRL+E)
    - taper "java" pour filter sur les fichiers Java par exemple

- Ajouter une variable membre Batiment batiment sur Personne :
    - private Batiment batiment;
    - Générer getter/setter

Trouver les usages de la classe Batiment dans le code :

- ouvrir la classe Batiment, sur le nom de la classe, "Find usages" (ALT+F7)

Actions complémentaires sur le code :

- Déplacer une méthode ou une variable membre :
    - Déplacer la méthode toString sous la méthode equals
        - cliquer sur le nom de la méthode
        - CTRL+SHIFT+flèche (bas ou haut) pour déplacer
- Mettre en commentaire / enlever les commentaires
    - Mettre en commentaire la méthode toString  (sélectionner les lignes + CTRL+/)
    - Décommenter : CTRL+/

Sélection de caractères :

- dans divers endroits du code Java, essayer CTRL+W plusieurs fois
- puis SHIFT+CTRL pour réduire la sélection
- CTRL+A pour sélectionner tout le contenu du fichier ouvert
- mode vertical (très productif dans certains cas) :
    - exemple : placer vous sur la première ligne "System.out.println" dans le main
    - taper CTRL+CTRL (en laissant enfoncé sur le 2èm CTRL)
    - appuyer sur la flèche du bas 2 fois : 3 curseurs apparaissent
    - appuyer sur CTRL+flèche droite pour vous déplacer rapidement à droite
    - ajouter ... juste avant le dernier ! pour obtenir
      System.out.println("Bonjour world <x> ...!"); sur les 3 lignes simultanément
