package carte;

import java.util.ArrayList;
import java.util.Random;

public class PaquetTriParRang {
	
	private ArrayList<Card> paquetTriParRang;
	
	public PaquetTriParRang(){

		paquetTriParRang = new ArrayList<Card>();

    }
	
	public ArrayList<Card> getPaquet() {
		return paquetTriParRang;
	}
	
	public void setPaquet(ArrayList<Card> paquetTriParRang) {
		this.paquetTriParRang = paquetTriParRang;
	}
	
	
	public void addCard(Card c){
		
		boolean find = false;
		
		if(! c.isStatut()) {
			
			if(!paquetTriParRang.isEmpty()) {
				
				int index = 0;
				int favoriteIndex = -1;
				int n = paquetTriParRang.size();
				
				for (Card card : paquetTriParRang) {
					
					index++;
					
					if( card.equals(c)) {
						find = true;
						break;
					}
					if(favoriteIndex < 0 && c.getRang() == 1) {
						 favoriteIndex = n;
					 }else {
						 if(favoriteIndex < 0 && (card.getRang() >= c.getRang() || card.getRang() ==1)) {
								favoriteIndex = index - 1;
							} 
					 }
					
					 //if(favoriteIndex < 0 && card.getRang() >= c.getRang()  ) {
						//favoriteIndex = index - 1;
					//} else if(favoriteIndex < 0 && paquetTriParRang.get(n-index).getRang() < c.getRang() ) {
						//favoriteIndex = n-index + 1;
					//}
					
					
				}
				
				if(!find) {
					
					paquetTriParRang.add(favoriteIndex, c);
					c.setStatut(true);
					
				}
				
				
			}else {
				paquetTriParRang.add(c);
				c.setStatut(true);
			}
			
			
		}
		
	}

	public Card radomCard() throws Exception{
		
		if(!paquetTriParRang.isEmpty()) {
			
			Card card ;
			
			final  int max = paquetTriParRang.size(), min = 0;
	
	        Random rand = new Random(); 
	        
	        int nombreAleatoire = rand.nextInt(max - min + 1) + min;
	        
	        card = paquetTriParRang.get(nombreAleatoire);
	        
	        paquetTriParRang.remove(nombreAleatoire);
	
	        return card;
			
		}else {
			throw new Exception(" Le paquet est vide  ");
		}
	
	 
	}

	public int size(){
	    return paquetTriParRang.size();
	}
	
	
	public void melanger(){

        if(paquetTriParRang.size() > 1) {
        	
        	Random r = new Random();

            for (int i = paquetTriParRang.size() - 1; i > 0; i--) {

                int j = r.nextInt(i);

                Card  temp = paquetTriParRang.get(i);
                paquetTriParRang.set(i, paquetTriParRang.get(j));
                paquetTriParRang.set(j, temp);


            }
        	
        	
        }
		
    }
	
	public void printCards() {
		
		if(!paquetTriParRang.isEmpty()) {
			
			for (Card card : paquetTriParRang) {
				
				System.out.println(card.toString());
				
			}
			System.out.println();
			System.out.println(" Ce paquet compte au total : " + paquetTriParRang.size() + " cartes ");
		
		}else {
			System.out.println();
			System.out.println(" Ce paquet est vide" );
		}
	
	}

}
