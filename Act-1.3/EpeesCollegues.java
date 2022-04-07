public class EpeesCollegues{

	public static void main(String[] args) {
  
		String[] collegues = {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
    
		int i;
		int j;
		int ind1;
		int ind2;
		boolean etat;
		String x;
     
		for (i = 0 ; i < collegues.length-1; i++ ) {
  	
			for (j = collegues.length-1 ; j > i; j-- ) {
        
        
				ind1=0;
				ind2=0;
				etat = false;
            
 
				while (ind1<collegues[j].length()+1 && ind2<collegues[j-1].length()+1  && etat==false) {
            
            
					if (collegues[j].charAt(ind1)<collegues[j-1].charAt(ind2)) {
						etat = true;
						x=collegues[j];
						collegues[j]=collegues[j-1];
						collegues[j-1]=x;
					} else if (collegues[j].charAt(ind1)>collegues[j-1].charAt(ind2)) {
						etat = true;
					} else {
						ind1=ind1+1;
						ind2=ind2+1;
					}
				}

			}

		}
    
    
		for (i = 0 ; i < collegues.length; i++ ) {
    
			System.out.println(collegues[i]);
    
		}
   
	}
}


