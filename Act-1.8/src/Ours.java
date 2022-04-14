import java.util.Scanner;

public class Ours extends Predateur implements PredateurAction,OursAction {
	
	protected String facteurAgressivite;
	protected String puissance;
	protected boolean statutHivernation;
	
	//constructeur par defaut
	public Ours () {
		
	}
	
	//Constructeur
	public Ours (String sex, String categorieAge, String force, String groupe,String facteurAgressivite, String puissance, boolean statutHivernation ) {
		super(sex, categorieAge, force, groupe);
		this.facteurAgressivite=facteurAgressivite;
		this.puissance=puissance;
		this.statutHivernation=statutHivernation;
	}
	
	//setter getter facteurAgressivite
	public String getFacteurAgressivite() {
		return this.facteurAgressivite;
	}
	public void setFacteurAgressivite() {	
		int facteurAgressivite;
		do {
		    System.out.println("Taper 1 ou 2 ou 3 pour indiquer le niveau d'agressivité de l'ours ");
		    Scanner clavier1 = new Scanner(System.in);
		    facteurAgressivite = clavier1.nextInt();
		    	if (facteurAgressivite==1) {
		    		this.facteurAgressivite = "Non Agressive";
		    	} else if (facteurAgressivite==2) {
		    		this.facteurAgressivite = "Agressive";
		    	} else if (facteurAgressivite==3) {
		    		this.facteurAgressivite = "Trés agressive";
		    	}else {
		    		System.out.println("Erreur il faut entrer 1 ou 2 ou 3");
		    		System.out.println();
		    	}
		    } while (this.facteurAgressivite==null);
	}

	//setter getter puissance
	public String getPuissance() {
		return this.puissance;
	}
	public void setPuissance() {
		int puissance;
		do {
		    System.out.println("Taper 1 ou 2 ou 3 pour indiquer le niveau de puissance de l'ours ");
		    Scanner clavier2 = new Scanner(System.in);
		    puissance = clavier2.nextInt();
		    	if (puissance==1) {
		    		this.puissance = "Non Puissant";
		    	} else if (puissance==2) {
		    		this.puissance = "Puissant";
		    	} else if (puissance==3) {
		    		this.puissance = "Trés Puissant";
		    	}else {
		    		System.out.println("Erreur il faut entrer 1 ou 2 ou 3");
		    		System.out.println();
		    	}
		    } while (this.puissance==null);
	}
	
	//setter getter statutHivernation
	public boolean getStatutHivernationn() {
		return this.statutHivernation;
	}
	public void setStatutHivernation() {
		int statutHivernation;
		    System.out.println("Taper 1 indiquer que l'ours est en StatutHivernation et 0 si non ");
		    Scanner clavier3 = new Scanner(System.in);
		    statutHivernation = clavier3.nextInt();
		    	if (statutHivernation==1) {
		    		this.statutHivernation = true;
		    	} else if (statutHivernation==0) {
		    		this.statutHivernation = false;
		    	} else {
		    		System.out.println("Erreur il faut entrer 1 ou 0");
		    		System.out.println();
		    		setStatutHivernation();
		    	}	    
	}	
	
	
	
	

	@Override
	public void senourrir() {
		// TODO Auto-generated method stub
		System.out.println("L'ours est omnivore");
	}

	@Override
	public void chasser() {
		// TODO Auto-generated method stub
		System.out.println("L'ours chasse seul");
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
		int son;
		System.out.println("L'ours hurle: Taper 1 (la peur), 2 (la présence), 3 (Effrayer un autre prédateur)ou 4 (agressivité)");
		Scanner clavier4= new Scanner(System.in);
		son = clavier4.nextInt();
		switch(son) {
		  case 1:
			  System.out.println("L'ours exprime la peur");
		    break;
		  case 2:
			  System.out.println("L'ours exprime sa présence");
		    break;
		  case 3:
			  System.out.println("L'ours effrayr un autre prédateur");
			break;
		  case 4:
			  System.out.println("L'ours exprime l’agressivité");
			break;
		  default:
			  System.out.println("L'ours n'exprime rien");
		}
	}

	@Override
	public void afficheCaracteristiques() {
		// TODO Auto-generated method stub
		System.out.println("L'ours est "+this.sexe  + " il est "+ this.categorieAge +" il est " + this.force + " il vit " + this.groupe 
        		+" il est " + this.facteurAgressivite + " il est " + this.puissance + " son statut d'ivernisatio est "+this.statutHivernation);
		
	}

	@Override
	public void grimper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creuser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hiverner() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
        return "L'ours est "+this.sexe  + " il est "+ this.categorieAge +" il est " + this.force + " il vit " + this.groupe 
        		+" il est " + this.facteurAgressivite + " il est " + this.puissance + " son statut d'ivernisatio, "+this.statutHivernation;
    }

}
