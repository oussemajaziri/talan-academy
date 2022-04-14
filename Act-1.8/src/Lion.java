import java.util.Scanner;

public class Lion extends Predateur implements PredateurAction,LionAction{
	
	protected String facteurDomination;
	protected String rangDomination;
	protected String facteurImpetuosite;
	
	//constructeur par defaut
	public Lion () {
		
	}
	
	//Constructeur
	public Lion (String sex, String categorieAge, String force, String groupe,String facteurDomination, String rangDomination, String facteurImpetuosite ) {
		super(sex, categorieAge, force, groupe);
		this.facteurDomination=facteurDomination;
		this.rangDomination=rangDomination;
		this.facteurImpetuosite=facteurImpetuosite;
	}
	
	//setter getter facteurDomination
	public String getFacteurDomination() {
		return this.facteurDomination;
	}
	public void setFacteurDomination() {
		int facteurDomination;
		do {
		    System.out.println("Taper 1 si le lion est dominant sinon Taper 0");
		    Scanner clavier1 = new Scanner(System.in);
		    facteurDomination = clavier1.nextInt();
		    	if (facteurDomination==1) {
		    		this.facteurDomination = "Dominant";
		    	} else if (facteurDomination==0) {
		    		this.facteurDomination = "Non dominant";
		    	} else {
		    		System.out.println("Erreur il faut entrer 1 ou 0");
		    		System.out.println();
		    	}
		    } while (this.facteurDomination==null);
	}

	//setter getter rangDomination
	public String getRangDomination() {
		return this.rangDomination;
	}
	public void setRangDomination() {
		int rangDomination;
		do {
		    System.out.println("Taper 1 ou 2 ou 3 ou 4 pour indiquer le niveau de dominantion ");
		    Scanner clavier2 = new Scanner(System.in);
		    rangDomination = clavier2.nextInt();
		    	if (rangDomination==1) {
		    		this.rangDomination = "APLHA";
		    	} else if (rangDomination==2) {
		    		this.rangDomination = "BETA";
		    	} else if (rangDomination==3) {
		    		this.rangDomination = "GAMA";
		    	}else if (rangDomination==4) {
		    		this.rangDomination = "NOMEGA";
		    	} else {
		    		System.out.println("Erreur il faut entrer 1 ou 2 ou 3 ou 4");
		    		System.out.println();
		    	}
		    } while (this.rangDomination==null);
	}
	
	//setter getter facteurImpetuosite
	public String getFacteurImpetuositen() {
		return this.facteurImpetuosite;
	}
	public void setFacteurImpetuosite() {
		int facteurImpetuosite;
		do {
		    System.out.println("Taper 1 si le lion est impétueux sinon Taper 0");
		    Scanner clavier2 = new Scanner(System.in);
		    facteurImpetuosite = clavier2.nextInt();
		    	if (facteurImpetuosite==1) {
		    		this.facteurImpetuosite = "Impétueux";
		    	} else if (facteurImpetuosite==0) {
		    		this.facteurImpetuosite = "Non Impétueux";
		    	} else {
		    		System.out.println("Erreur il faut entrer 1 ou 0");
		    		System.out.println();
		    	}
		    } while (this.facteurImpetuosite==null);
	}
	
	@Override
	public void senourrir() {
		// TODO Auto-generated method stub
		System.out.println("Le lion se nourrit uniquement de viande");
	}

	@Override
	public void chasser() {
		// TODO Auto-generated method stub
		System.out.println("Le lion chasse en groupe");
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
		System.out.println("Le lion rugit: Taper 1 (appartenance), 2 (domination), 3 (soumission)ou 4 (agressivité)");
		Scanner clavier3= new Scanner(System.in);
		son = clavier3.nextInt();
		switch(son) {
		  case 1:
			  System.out.println("Le lion exprime l’appartenance à son groupe");
		    break;
		  case 2:
			  System.out.println("Le lion exprime la domination");
		    break;
		  case 3:
			  System.out.println("Le lion exprime la soumission");
			break;
		  case 4:
			  System.out.println("Le lion exprime l’agressivité");
			break;
		  default:
			  System.out.println("Le lion n'exprime rien");
		}
		
	}

	@Override
	public void afficheCaracteristiques() {
		// TODO Auto-generated method stub
		System.out.println("Le lion est "+this.sexe  + " il est "+ this.categorieAge +" il est " + this.force + " il vit " + this.groupe 
        		+" il est " + this.facteurDomination + " son rang de domination est " + this.rangDomination + 
        		" il est "+this.facteurImpetuosite);
	}

	@Override
	public void entendreSon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seSepareDuGroupe() {
		// TODO Auto-generated method stub
		
	}
	
	//s

	
}
