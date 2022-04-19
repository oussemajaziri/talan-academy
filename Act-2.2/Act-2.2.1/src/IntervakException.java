
public class IntervakException extends Exception {
	
	public IntervakException () {
		
	}
	
	public IntervakException (String message) {
		super("L'entier doit etre inclus entre 10 et 30");
	}
	
}
