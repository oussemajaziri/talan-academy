import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int nombreLion;
	    GroupeLion groupeLion= new GroupeLion ();

	    
	    
	    
	    System.out.println("Dans ce jeux vous serez inviter à construire un goupe de lion en respectant les étapes suivantes: ");
	    System.out.println("Etape 1: Inserer la zone du groupe ");
	    System.out.println("Etape 2: choisir le nombre de lions dans ce groupe");
	    System.out.println("Etape 2: Inserer les lions dans le groupe");
	    System.out.println();
	    System.out.println();
	    
	  
	    groupeLion.setZone();
	    
	    
	    System.out.println("Combien de lion voulez vous ajouter au groupe?  ");
	    groupeLion.setTailleFemale(0);
	    groupeLion.setTailleMale(0);
	    Scanner clavier1 = new Scanner(System.in);
	    nombreLion = clavier1.nextInt();
	    
	    for (int i=0; i<nombreLion;i++) {
	    	System.out.println();
	    	System.out.println("Entrer données lion n° "+(i+1) +" ");
			Lion lion= new Lion ();		
			lion.setSexe();
				if (lion.sexe.equals("Female")) {
					groupeLion.tailleFemale+=1;
				}else {
					groupeLion.tailleMale+=1;
				}
			lion.setCategorieAge();
			lion.setForce();
			lion.setGroupe();
			lion.setFacteurDomination();
			lion.setRangDomination();
			lion.setFacteurImpetuosite();
			groupeLion.ajoutMembre(lion);
	    }
	    
	    System.out.println();
	    System.out.println();
	    
	    groupeLion.afficheCaractéristiqueGroupe();
	    groupeLion.afficheCaractéristiquesMembres();
	   
	    System.out.println("Taper 1 si vous voulez enlever un elemnt  ");
	    Scanner clavier2 = new Scanner(System.in);
	    int enlever = clavier2.nextInt();
	    	if (enlever==1) {
	    	    System.out.println("Taper le numero de lion a enlever  ");
	    	    Scanner clavier3 = new Scanner(System.in);
	    	    int nbr = clavier3.nextInt();
	    	    groupeLion.enleverMembre(nbr);
	    	    System.out.println();
	    	    System.out.println("Les nouvelles membre  ");
	    	    groupeLion.afficheCaractéristiquesMembres();
	    	}
	    
	    	System.out.println();
		    System.out.println("Taper 1 si vous voulez choisir un couple dominant  ");
		    Scanner clavier4 = new Scanner(System.in);
		    int dom = clavier4.nextInt();
		    	if (dom==1) {
		    	    System.out.println("Taper le numero de lion à choisir dominant  ");
		    	    Scanner clavier5 = new Scanner(System.in);
		    	    int indM = clavier5.nextInt();
		    	    System.out.println("Taper le numero de lionne à choisir dominante  ");
		    	    Scanner clavier6 = new Scanner(System.in);
		    	    int indF = clavier6.nextInt();
		    	    groupeLion.constituerCoupleDominant(indM, indF);
		    	    
		    	    groupeLion.déclareLionNonDominant();
		    	}
	    
	    
	    
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
