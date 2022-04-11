

import java.util.Scanner;
public class Position{

	public static void main(String[] args) {
  	
	int[] tab = {0,2,4,6,7,8};
	int x,pos;

	Scanner clavier = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre: ");
        x= clavier.nextInt();	
	pos = pos(tab,x,0);

	System.out.print("position: " + pos );
	
	}
	
	static int pos(int[] t, int x,int i){
		int p;
		p=t.length+1;

		if (x<t[i]){
			p=i;
		}
		else if (i<t.length-1) {
			return pos(t,x,i+1);
		}
		else {
			p=t.length;	
		}
		return p;

  	}
}