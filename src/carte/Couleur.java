package carte;

public enum Couleur {
	
	COEUR("Coeur"), 
	CARREAU("Carreau"), 
	PIQUE("Pique"), 
	TREFLE("Trefle");
	
	private final String couleur;

	private Couleur(String couleur) {
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}
	
	

}
