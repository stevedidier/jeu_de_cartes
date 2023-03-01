package carte;

public class Card {

    private final Couleur couleur;
    private final Rang     rang;
    private boolean statut; // if card is package or not
   
    public Card (Couleur couleur, int rang) throws Exception{

        if((rang >= 1 && rang <= 13) ) {
        	
        	this.rang = Rang.values()[rang -1]; 
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
        hash = 53 * hash + this.rang.getRg();
        return hash;
    }
    
    
    public Couleur getCouleur (){
    	
        return couleur;
    }
    
    public int getRang (){
        return rang.getRg();
    }
    
    
    public String getNomCouleur (){

        return couleur.getCouleur();

    }
    
    public String getNomRang (){

        return rang.getRgName();

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
	
	public static void main(String[] args) {
		System.out.println(Rang.values()[0].getRgName());
	}

}
