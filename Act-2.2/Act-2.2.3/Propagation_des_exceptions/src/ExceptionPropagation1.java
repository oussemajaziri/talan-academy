import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionPropagation1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Insert a number:");
		int c=0;
		try {
			c = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.getMessage();
		}
		try {
			first(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

	private static void first(int a) {
			try {
				second(a);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
	}

	private static void second(int b) throws Exception  {
		Exception propagate = new Exception("The value is too small.");
		if (b < 10) {
			// Error - Envoyer une Exception
			throw propagate;
		}
		System.out.println("OK");
	}
	
}