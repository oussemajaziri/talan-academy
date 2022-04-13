import java.util.Scanner;

import java.util.Scanner;
public abstract class Predateur implements PredateurAction {
	
	protected String sexe;
	protected String categorieAge;
	protected String force;
	protected String groupe;
	
	//Constructeur par defaut
	public Predateur () {
		
	}
	
	//constructeur
	public Predateur (String sex, String categorieAge, String force, String groupe) {
		this.sexe=sex;
		this.categorieAge=categorieAge;
		this.force=force;
		this.groupe=groupe;
	}
	
	//setter getter sexe
	public String getSexe() {
		return this.sexe;
	}
	public void setSexe() {
		String sexe;
		do {
	    System.out.println("entrer les sex du prdateur F ou M");
	    Scanner clavier1 = new Scanner(System.in);
	    sexe = clavier1.nextLine();
	    	if ("F".equals(sexe.toUpperCase())) {
	    		this.sexe = "Femala";
	    	} else if ("M".equals(sexe.toUpperCase())) {
	    		this.sexe = "Male";
	    	} else {
	    		System.out.println("Erreur il faut entrer M ou F");
	    		System.out.println();
	    	}
	    } while (this.sexe==null); 	
	}
	
	//getter setteur categorieAge
	public String getCategorieAge() {
		return this.categorieAge;
	}
	public void setCategorieAge() {
		int age;
		do {
	    System.out.println("entrer l'age");
	    Scanner clavier2 = new Scanner(System.in);
	    age = clavier2.nextInt();
	    	if (age >0 && age<10) {
	    		this.categorieAge="Jeune";
	    	} else if (age>=10 && age<=15) {
	    		this.categorieAge="adulte";
	    	} else if (age>15) {
	    		this.categorieAge="Vieux";
	    	} else {
	    		System.out.println("Erreur age doit être > 0 ");
	    		System.out.println();	    		
	    	}
		} while (age<=0);
	}
	
	//getter setteur force
	public String getForce() {
		return this.force;
	}
	public void setForce() {
		int force;
		do {
		    System.out.println("entrer le niveau de force du predateur: 1 , 2 ou 3");
		    Scanner clavier3 = new Scanner(System.in);
		    force = clavier3.nextInt();
		    	if (force==1) {
		    		this.force="faible";
		    	} else if (force==2) {
		    		this.force="fort";
		    	} else if (force==3) {
		    		this.force="trés fort";
		    	} else {
		    		System.out.println("Erreur niveau de force possible sont 1,2 et 3 ");
		    		System.out.println();	    		
		    	}
			} while (force!=1 && force!=2 && force!=3);		
	}
	
	//getter setteur groupe
	public String getGroupe() {
		return this.groupe;
	}
	public void setGroupe() {
		int groupe;
		do {
		    System.out.println("entrer 1 si le predateur vit en groupe ou 2 s'il est solitaire");
		    Scanner clavier4 = new Scanner(System.in);
		    groupe = clavier4.nextInt();
		    	if (groupe==1) {
		    		this.groupe="En groupe";
		    	} else if (groupe==2) {
		    		this.groupe="Solitaire";
		    	} else {
		    		System.out.println("Erreur, entrer 1 ou 2 ");
		    		System.out.println();	    		
		    	}
			} while (groupe!=1 && groupe!=2);
	}
	
	@Override
	public void senourrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chasser() {
		// TODO Auto-generated method stub
		System.out.println("Le lion chasse");
	}

	@Override
	public void courir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seReproduire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emettreSon() {
		// TODO Auto-generated method stub
		
	}
	
}
