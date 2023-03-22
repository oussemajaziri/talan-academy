
import java.util.Scanner;
public class PlayListeUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbrMusique;
		PlayListelmpl listeMax = new PlayListelmpl();
		int max = listeMax.getMaxMusique();
	    do {
	    System.out.println("Donner le nombre de musique: ");
	    System.out.println("Le nombre doit etere <=  "+ max);
	    Scanner clavier1 = new Scanner(System.in);
	    nbrMusique = clavier1.nextInt();
	    } while(nbrMusique>max || nbrMusique<0);
	    
		Musiquelmpl[] tableauMusique = new Musiquelmpl[nbrMusique];
		String nomPlayListe;
		String genreListe;
		
	    System.out.println("Donner le nom de la play liste");
	    Scanner clavier2 = new Scanner(System.in);
	    nomPlayListe = clavier2.next();
	    
	    
	    
	    System.out.println("Donner le genre de la play liste");
	    Scanner clavier3 = new Scanner(System.in);
	    genreListe = clavier2.next();
	   
	    
		//PlayListelmpl liste = new PlayListelmpl(nomPlayListe, genreListe, nbrMusique, tableauMusique);
		
	    
	    for (int i=0; i<nbrMusique;i++) {
	    	
	    	Musiquelmpl musique = new Musiquelmpl();
	    	String titreMusique;
		    System.out.println("Donner le nom de la musique"+(i+1));
		    Scanner clavier4 = new Scanner(System.in);
		    titreMusique = clavier4.next();
		    musique.setTitre(titreMusique);
		    
		    String auteurMusique;
		    System.out.println("Donner l'auteur de la musique"+(i+1));
		    Scanner clavier5 = new Scanner(System.in);
		    auteurMusique = clavier5.next();
		    musique.setAutheur(auteurMusique);
		    
		    String interpreteMusique;
		    System.out.println("Donner l'interpreteMusique de la musique"+(i+1));
		    Scanner clavier6 = new Scanner(System.in);
		    interpreteMusique = clavier6.next();
		    musique.setInterprete(interpreteMusique);
		    		    
		    String genreMusique;
		    System.out.println("Donner le genre de la musique"+(i+1));
		    Scanner clavier7 = new Scanner(System.in);
		    genreMusique = clavier7.next();
		    musique.setGenre(genreMusique);
		    
		    tableauMusique[i]= musique;
	    }
	    
	    
	    for (int j=0; j<nbrMusique;j++) {
	    	System.out.println(tableauMusique[j]);
	    } 
	    
	    
	   
	}

}
