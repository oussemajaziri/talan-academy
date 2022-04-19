import java.util.Scanner;

public class Main  {

	public static void main(String[] args) throws IntervakException {
		// TODO Auto-generated method stub
		System.out.println("Saisir un nombre entre 10 et 30 inclus : ");
		Scanner clavier = new Scanner(System.in);
		int num = clavier.nextInt();
		if (num <10 || num>30) {
			throw new IntervakException("L'entier doit etre inclus entre 10 et 30");
		} 
	}
}
