import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Filtre {

	
	public static void main(String[] args) throws IOException { 
		System.out.println("Saisir le path du dossier : ");
		Scanner clavier = new Scanner(System.in);
		String path = clavier.nextLine();
		clavier.close();
		File dir  = new File(path);
		affichContenu (dir);
	}
		   
		   
		   public static void affichContenu (File dir) {
			      File[] liste = dir.listFiles();
			      String[] files = dir.list();
			      String[] listFiltree = dir.list(new Filtre());
			    
			      for (int i = 0; i < files.length; i++) {
			    	  if(liste[i].isFile()) { 
			    		  System.out.println(files[i]); 
			          }  else if(liste[i].isDirectory()) {
			        	  System.out.println("Le contenu du dossier : "+files[i]);
			        	  affichContenu (liste[i]);
			          }         
			      }
			      
			      for (int i = 0; i < listFiltree.length; i++) {
			        	  System.out.println("Les fichiers java sont : ");
			        	  System.out.println (listFiltree[i]);
			                  
			      }			      	      
		   }
}
