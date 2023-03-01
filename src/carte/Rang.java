package carte;

public enum Rang {

	R1(1),
	R2(2),
	R3(3),
	R4(4),
	R5(5),
	R6(6),
	R7(7),
	R8(8),
	R9(9),
	R10(10),
	R11(11),
	R12(12),
	R13(13);
	
	
	private int rg;
	private String rgName;
	

	 Rang(int i) {
		this.rg = i;
		
	}


	public int getRg() {
		return rg;
	}



	public String getRgName() {
		
		if(rg == 1) {
			rgName = "As";
		}else if (rg > 1 && rg <= 10) {
			
			rgName = String.valueOf(rg); 
			
		}else if(rg > 10) {
			
			switch (rg) {
			case 11:
				rgName = "Valet";
				break;
				
			case 12:
				rgName = "Dame";
				break;
				
			case 13:
				rgName = "Roi";
				break;

			default:
				break;
			}
		}
		
		return rgName;
	}


}
