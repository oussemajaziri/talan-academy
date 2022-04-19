
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SeLit {

	static void lecture(Scanner source) {
	       while(source.hasNextLine()) {
	           String s = source.nextLine();
	           System.out.println("LU:"+s);
	       }
	   }

	   static public void main(String[] args) throws IOException {
	     
		   FileReader fileReader = new FileReader("C:\\Users\\ojaziri\\eclipse-workspace\\Lecture_Ecriture_Fichier\\src\\SeLit.java");
		   
		   BufferedReader reader = new BufferedReader (fileReader);
		   
		   ArrayList<String> byLines = new ArrayList();
		   ArrayList<String> ps = new ArrayList();
		   LinkedList<String> textALenvers = new LinkedList();
		   
		 
			   String line;
			   String p;
			
			   
			   
			   
			   while ((line = reader.readLine()) !=null) {
				   textALenvers.addFirst(line);
				   p="path" + ".txt";
				   ps.add(p);
				   byLines.add(line);
			   }
		 
		   
		      for(String elem: byLines)
		       {
		       	 System.out.println (elem);
		       	 
		       }
		   
		      for(String elem: textALenvers)
		       {
		       	 System.out.println (elem);
		       	 
		       }
		      
		      System.out.println();
		      System.out.println();
		      System.out.println();
		      
		  	       
		      
	   }
}
