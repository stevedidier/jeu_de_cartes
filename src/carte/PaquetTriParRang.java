package carte;

import java.util.ArrayList;
import java.util.Random;

public class PaquetTriParRang {
	
	private ArrayList<Card> paquetTriParRang;
	
	public PaquetTriParRang(){

		paquetTriParRang = new ArrayList<Card>();
		
    }
	
	public ArrayList<Card> getPaquet() {
		return new ArrayList<Card>(paquetTriParRang);
	}
	
	public void setPaquet(ArrayList<Card> paquetTriParRang) throws Exception{
		
		if(paquetTriParRang != null) {
			this.paquetTriParRang = new ArrayList<Card>(paquetTriParRang);
		}else {
			throw new IllegalArgumentException("paquet is null");
		}
		
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
		
		if(paquetTriParRang != null) {
			
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
			
		}else {
			throw new Exception("paquet is null");
		}
		
		
	
	 
	}

	public int size() throws Exception{
		
		if(paquetTriParRang != null) {
			return paquetTriParRang.size();
		}else {
			throw new Exception("paquet is null");
		}
		
	    
	}
	
	
	public void melanger() throws Exception{
		
		if(paquetTriParRang != null) {
			
			if(paquetTriParRang.size() > 1) {
	        	
	        	Random r = new Random();

	            for (int i = paquetTriParRang.size() - 1; i > 0; i--) {

	                int j = r.nextInt(i);

	                Card  temp = paquetTriParRang.get(i);
	                paquetTriParRang.set(i, paquetTriParRang.get(j));
	                paquetTriParRang.set(j, temp);


	            }
	        	
	        	
	        }
		}else {
			throw new Exception("paquet is null");
		}

        
		
    }
	
	public void printCards() throws Exception{
		
		if(paquetTriParRang != null) {
			
			if(!paquetTriParRang.isEmpty()) {
				
				for (Card card : paquetTriParRang) {
					
					System.out.println(card.toString());
					
				}
				System.out.println();
				System.out.println(" Ce paquet compte au total : " + paquetTriParRang.size() + " cartes ");
			
			}else {
				throw new Exception(" Le paquet est vide  ");
			}
			
		}else {
			throw new Exception("paquet is null");
		}
		
	
	}

}
