package carte;

import java.util.ArrayList;
import java.util.Random;

public class Paquet {
	
	private ArrayList<Card> paquet;
	
	public Paquet(){

        paquet = new ArrayList<Card>();

    }
	

	
	public ArrayList<Card> getPaquet() {
		
		return new ArrayList<Card>(paquet);
	}

	public void setPaquet(ArrayList<Card> paquet) throws Exception{
		
		if(paquet != null) {
			this.paquet = new ArrayList<Card>(paquet);
		}else {
			throw new IllegalArgumentException("paquet is null");
		}
		
	}


	public void addCard(Card c){
		
		boolean find = false;
		
		if(! c.isStatut()) {
			
			if(!paquet.isEmpty()) {
				
				for (Card card : paquet) {
					
					if( card.equals(c)) {
						find = true;
						break;
					}
				
				}
				
				if(!find) {
					
					paquet.add(c);
					c.setStatut(true);
					
				}
				
				
			}else {
				paquet.add(c);
				c.setStatut(true);
			}
			
			
		}
		
	}
	
	public Card radomCard() throws Exception{
		
		if(paquet != null) {
			
			if(!paquet.isEmpty()) {
				
				Card card ;
				
				final  int max = paquet.size(), min = 0;

		        Random rand = new Random(); 
		        
		        int nombreAleatoire = rand.nextInt(max - min + 1) + min;
		        
		        card = paquet.get(nombreAleatoire);
		        
		        paquet.remove(nombreAleatoire);

		        return card;
				
			}else {
				throw new Exception(" Le paquet est vide  ");
			}
		}else {
			throw new Exception(" Le paquet est null  ");
		}
		

    }
	
	
	public int size() throws Exception{
		
		if(paquet != null) {
			return paquet.size();
		}else {
			throw new Exception(" Le paquet est null  ");
		}
        
    }
	
	
	
	
	public void melanger() throws Exception{
		
		if(paquet != null) {
			if(paquet.size() > 1) {
	        	
	        	Random r = new Random();

	            for (int i = paquet.size() - 1; i > 0; i--) {

	                int j = r.nextInt(i);

	                Card  temp = paquet.get(i);
	                paquet.set(i, paquet.get(j));
	                paquet.set(j, temp);


	            }
	        	
	        	
	        }
		}else {
			throw new Exception(" Le paquet est null  ");
		}
        
		
    }
	
	public void printCards() throws Exception{
		
		if(paquet != null) {
			if(!paquet.isEmpty()) {
				
				for (Card card : paquet) {
					
					System.out.println(card.toString());
					
				}
				System.out.println();
				System.out.println(" Ce paquet compte au total : " + paquet.size() + " cartes ");
			
			}else {
				throw new Exception(" Le paquet est vide  ");
			}
		}else {
			throw new Exception(" Le paquet est null  ");
		}
		
		
	}
	

}
