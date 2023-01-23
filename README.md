Objectif, créer une librairie de manipulation de cartes et de paquets de cartes. Il faut considérer que votre librairie sera utilisée par d'autres développeurs. Il faut donc concevoir une librairie sécurisée, bien pensée et performante.

Définition d'un jeu de carte https://fr.wikipedia.org/wiki/Jeu_de_cartes_fran%C3%A7ais

    Écrire une classe Carte identifiant la carte par son rang et sa couleur.

    Écrire une classe Paquet décrivant le comportement d'un paquet de carte avec les fonctionnalités suivantes :

        Un paquet peut être vide

        Ajouter une carte Si une carte de même rang et même couleur (pique, carreau, coeur, trèfle) est déjà dans un paquet 
	il ne faut pas ajouter la nouvelle carte. Si une carte est déjà dans un autre paquet, 
	elle ne peut pas être ajouté.

        Tirer une carte au hasard.

        Mélanger les cartes du paquet.

        Indiquer la taille du paquet.

    Écrire une classe de test
        Remplir le paquet avec 10 cartes de votre choix.
        Afficher le contenu avec des libellés du type "9 de trèfle".
        Tirer 2 cartes et les afficher de la même manière.
        Afficher de nouveau le paquet et montrer qu'il y a deux cartes de moins.
        Montrer que si une carte est dans un paquet elle ne peut pas être dans un autre.

Tri

    Écrire une classe PaquetTriParRang qui comme son nom l'indique devra être trié dans l'ordre croissant (du 2 à l'as). Vous devez utiliser obligatoirement les classes standards de Java pour effectuer l'opération.
    Afficher avec une classe de test les dix cartes précédentes triées.
