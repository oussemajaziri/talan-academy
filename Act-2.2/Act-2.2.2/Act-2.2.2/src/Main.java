import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws FileNotFoundException,NumberFormatException {
		// TODO Auto-generated method stub
		
		// PrintWriter writer = new PrintWriter("data.txt");
		BufferedReader br = null;
		String line = null;
		int n = 0;
		try {
			
				br = new BufferedReader(new FileReader("data.txt"));
				// could generate FileNotFoundException (checked)

		} catch (FileNotFoundException e) {
			
				System.out.println(e.getMessage());
				
		}
		
		int max = -1;
		
		try {
				line = br.readLine();
				// peut générer IOException
		} catch (IOException e) {
				e.printStackTrace();
		}
		
		while (line != null) {
			
	            try {
	            	n = Integer.parseInt(line);
	            	// peut générer NumberFormatException
	            } catch (NumberFormatException e) {
	            	System.out.println(e.getMessage());
	            }
	            
	            
	            if (n > max) max = n;
	            
	            try {
	            	line = br.readLine();
	            	// peut générer IOException
	            } catch (IOException e) {
	            	e.printStackTrace();
	            }
	                
	    }
		
		
	    System.out.println("Maximum = " + max);
	        
	}
}
