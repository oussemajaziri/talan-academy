import java.util.Scanner;
 
public class Palindrom {
    public static void main(String args[]) {


        String mot,motInv="";
	int i,j;
	char c;
	boolean res=true;

        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir un mot : ");
        mot= clavier.nextLine();
 
 

	for (i = mot.length()-1 ; i>-1; i-- ) {

		c=mot.charAt(i);

		motInv = motInv + c;

	}

	

	for (j = 0 ; j<mot.length(); j++ ) {

		if ((mot.charAt(j))!= (motInv.charAt(j))) {

  			res=false;
	
		}

	}



	if (res==true) {
  			System.out.println("Le mot est palindrome");
		} else {
			System.out.println("Le mot n'est pas palindrome");
	}

 
    }
}