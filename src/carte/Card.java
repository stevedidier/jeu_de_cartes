package carte;

enum COULEUR {COEUR, CARREAU, PIQUE, TREFLE};

public class Card {
	
	static public final String[] NOMS_COULEURS = {"Coeur", "Carreau", "Pique", "Trefle"};

    static public final String[] NOMS_RANGS = { "As", "2", "3", "4",
                     "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
    
    private final COULEUR couleur;
    private final int     rang;
    private boolean statut; // if card is package or not
   
    public Card (COULEUR couleur, int rang) throws Exception{

        if((rang >= 1 && rang <= 13) ) {
        	
        	this.rang = rang; 
        	this.couleur = couleur;
            this.statut = false;
        	
        } else {
        	throw new Exception(" Rang Invalide ");
        }
       
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Card other = (Card) obj;
        if ((this.getNomCouleur() == null) ? (other.getNomCouleur() != null) : !this.getNomCouleur().equals(other.couleur)) {
            return false;
        }

        if (this.rang != other.rang) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.getNomCouleur() != null ? this.getNomCouleur().hashCode() : 0);
        hash = 53 * hash + this.rang;
        return hash;
    }
    
    
    public COULEUR getCouleur (){
        return couleur;
    }
    
    public int getRang (){
        return rang;
    }
    
    
    public String getNomCouleur (){

        String nom = "";
        for (String coul : NOMS_COULEURS) {
            if(coul.equalsIgnoreCase(couleur.name())){
                nom = coul;

            }
            
        }

        return nom;

    }
    
    public String getNomRang (){

        return NOMS_RANGS[rang -1];

    }


	public boolean isStatut() {
		return statut;
	}


	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	
	
	@Override
	public String toString() {
		return this.getNomRang() +" de " + this.getNomCouleur();
	}

}
