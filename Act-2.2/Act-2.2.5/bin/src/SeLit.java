
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
		   ArrayList<String> paths = new ArrayList();
		   LinkedList<String> textALenvers = new LinkedList();
		   
		   try {
			   String line = reader.readLine();
			   String path = "monFichier_L";
			   
			   while (line!=null) {
				   line=reader.readLine();
				   textALenvers.addFirst(line);
				   path="path" + ".txt";
				   paths.add(path);
				   byLines.add(line);
			   }
		   } catch (IOException e) {
			   e.printStackTrace();		  
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
		      
		      
		      /**
		      
		      for(int i=0;i<paths.size()-1;i++)
		       {
		    	   File myObj = new File("line.txt"); 
		    	   Writer fileWriter = new FileWriter ("line.txt");
				   BufferedWriter writer = new BufferedWriter (fileWriter);
				   writer.write(byLines.get(i));
				   System.out.println(byLines.get(i));
		    	  
		       }  
		       
		       */
	   }
}