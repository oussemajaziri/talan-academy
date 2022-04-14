import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int nombreLion;
	    GroupeLion groupeLion= new GroupeLion ();
	    
	    System.out.println("Combien de lion voulez vous ajouter au groupe?  ");
	    Scanner clavier1 = new Scanner(System.in);
	    nombreLion = clavier1.nextInt();
	    
	    for (int i=0; i<nombreLion;i++) {
			Lion lion= new Lion ();		
			lion.setSexe();
			lion.setCategorieAge();
			lion.setForce();
			lion.setGroupe();
			lion.setFacteurDomination();
			lion.setRangDomination();
			lion.setFacteurImpetuosite();
			groupeLion.ajoutMembre(lion);
	    }
	    
	    
	    groupeLion.afficheCaractéristiquesMembres();
	    groupeLion.enleverMembre(1);
	    
	    
	    
		// Lion lion2 = new Lion("m", "vieux", "fort", "en groupe","gama", "dominant", "impetueux" ) ;
		// lion2.afficheCaracteristiques();
	
	    /**
		//Ajouter instance lion de la classse Lion
		Lion lion= new Lion ();		
		lion.setSexe();
		lion.setCategorieAge();
		lion.setForce();
		lion.setGroupe();
		lion.setFacteurDomination();
		lion.setRangDomination();
		lion.setFacteurImpetuosite();
		
		//afficher les caracteristiques de l'instance lion
		lion.afficheCaracteristiques();
		lion.emettreSon();
		*/
	
	
	/**
		//Ajouter instance ours de la classse Ours
		Ours ours= new Ours ();
		ours.setSexe();
		ours.setCategorieAge();
		ours.setForce();
		ours.setGroupe();
		ours.setFacteurAgressivite();
		ours.setPuissance();
		ours.setStatutHivernation();
		
		//afficher les caractéristique de l'instance ours
		ours.afficheCaracteristiques();
		ours.emettreSon();
		
	*/
		
		
	}

}
