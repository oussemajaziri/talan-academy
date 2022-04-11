
import java.util.Scanner;
public class Search{

	public static void main(String[] args) {
  
		int[] tab;
		int n,nbr,i;
		boolean res=false;

		tab=tabCreate();

		Scanner clavier1 = new Scanner(System.in);
        	System.out.print("Veuillez saisir un nombre: ");
        	nbr= clavier1.nextInt();

		res=nbrExist(tab,nbr,0);

		if (res==true){
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}


	}


	 static int[] tabCreate( ){
		
		int n,i,x;

		Scanner clavier2 = new Scanner(System.in);
        	System.out.print("Enter la taille du tableau: ");
        	n= clavier2.nextInt();
		int[] t = new int[n];
			
   		for ( i = 0; i < n; i++) {
			Scanner clavier3 = new Scanner(System.in);
        		System.out.print("Donner l'element "+i+1+" du tableau");
			x= clavier3.nextInt();
        		t[i]= x;	
		} 

		for ( i = 0; i < t.length; i++) {
			
        		System.out.print(t[i]);
				
		} 

		return t;
  	}

	 static boolean nbrExist(int[] t, int x,int i){
		boolean res=false;

		if (i==t.length){
			res=false;
		}
		else {
			if (t[i]==x){
				res=true;
			} else {
				return nbrExist(t,x,i+1);
			}
		}	
		
		return res;

  	}

}