package carte;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		PaquetTriParRang paquet = new PaquetTriParRang();
		
		Card asDePique = new Card(COULEUR.PIQUE, 1);
		paquet.addCard(asDePique);
		
		Card valetDeCarreaux = new Card(COULEUR.CARREAU, 11);
		paquet.addCard(valetDeCarreaux);
		
		
		Card deuxDePique = new Card(COULEUR.PIQUE, 2);
		paquet.addCard(deuxDePique);
		
		Card SeptDePique = new Card(COULEUR.PIQUE, 7);
	    paquet.addCard(SeptDePique);
		
		Card dameDeCoeur = new Card(COULEUR.COEUR, 12);
		paquet.addCard(dameDeCoeur);
		
		Card asDeTreffe = new Card(COULEUR.TREFLE, 1);
		paquet.addCard(asDeTreffe);
		
		Card valetDeTreffe = new Card(COULEUR.TREFLE, 11);
		paquet.addCard(valetDeTreffe);
		Card deuxDeCarreau = new Card(COULEUR.CARREAU, 2);
		paquet.addCard(deuxDeCarreau);
		
		Card SeptDeCoeur = new Card(COULEUR.COEUR, 7);
		paquet.addCard(SeptDeCoeur);
		
		Card dameDePique = new Card(COULEUR.PIQUE, 12);
		paquet.addCard(dameDePique);
		
		// Afficher le contenu avec des libellés du type "9 de trèfle".
		
		System.out.println("Afficher le contenu avec des libellés du type \"9 de trèfle");
		System.out.println("************************************************************ ");
		
		paquet.printCards();
		
		System.out.println("\n");
		
		// Melanger le paquet
		System.out.println("Melanger le paquet ");
		System.out.println("******************* ");
		
		paquet.melanger();
		
		paquet.printCards();
		
		System.out.println("\n");
		
		// Tirer 2 cartes et les afficher de la même manière.
		
		System.out.println("Tirer 2 cartes et les afficher de la même manière. ");
		System.out.println("*************************************************** ");
		
		Card carteTir1 = paquet.radomCard();
		Card carteTir2 = paquet.radomCard();
		
		System.out.println(carteTir1.toString());
		System.out.println(carteTir2.toString());
		System.out.println("\n");
		
		
		// Afficher de nouveau le paquet et montrer qu'il y a deux cartes de moins.
		System.out.println("Afficher de nouveau le paquet et montrer qu'il y a deux cartes de moins. ");
		System.out.println("*************************************************************************");
		
		paquet.printCards();
		
		System.out.println("\n");
		
		
		
		// Montrer que si une carte est dans un paquet elle ne peut pas être dans un autre.
		
		System.out.println("Montrer que si une carte est dans un paquet elle ne peut pas être dans un autre. ");
		System.out.println("**********************************************************************************");
		
		Paquet nouveauPaquet = new Paquet();
		//nouveauPaquet.addCard(paquet.getPaquet().get(0));
		nouveauPaquet.printCards();
		
		System.out.println("\n");
		
		
		
		
		
		
		
	

		
	}

}
