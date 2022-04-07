import java.util.Scanner;
 
public class CompterButin{
    public static void main(String args[]) {


        
	int nbr1,nbr2,resInter=0,res=0;
	String op,continuer="",decision;
	char op2;


	decision="OUI";

	while (decision=="OUI") {

  		Scanner clavier = new Scanner(System.in);
        	System.out.print("Veuillez saisir un nombre: ");
        	nbr1= clavier.nextInt();

	
        	System.out.print("Veuillez saisir un nombre: ");
        	nbr2= clavier.nextInt();
 
		Scanner clavier2 = new Scanner(System.in);
        	System.out.print("Veuillez saisir une opération: ");
        	op= clavier2.nextLine();
 		op2=op.charAt(0);
 
 
		if (op2=='/'){
			resInter = nbr1/nbr2;
		} else if (op2=='*'){
			resInter = nbr1*nbr2;
		} else if (op2=='-'){
			resInter = nbr1-nbr2;
		} else if (op2=='+'){
			resInter = nbr1+nbr2;
		} 
	

		res = res + resInter;
		System.out.print(res);


		System.out.print("    Continuez?  tapez oui pour continuer et non pour Sortir   ");
		Scanner clavier3 = new Scanner(System.in);
		continuer= clavier3.nextLine();
		System.out.print(continuer);

		decision=continuer.toUpperCase();
		System.out.print(decision);

		
	}

       
    }
}