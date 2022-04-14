import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupeLion extends GroupePredateur implements GroupeLionAction,GroupePredateurAction{

	
	protected Lion maleDominant;
	protected Lion femaleDominante;
	protected String puissance;
	private List<Lion> lionListe = new ArrayList<Lion>();

	//Constructeur par defaut
	public GroupeLion () {
		
	}
	
	//constructeur
	public GroupeLion (int tailleMale,int tailleFemale, String zone,List<Lion> lionsListe,Lion maleDominant,Lion femaleDominante,String puissance) {
		super(tailleMale,tailleFemale,zone);
		this.maleDominant=maleDominant;
		this.femaleDominante=femaleDominante;
		this.puissance=puissance;
		this.lionListe=lionsListe;
	}
	
	//setter getter maleDominant
	public Lion getmMaleDominant() {
		return this.maleDominant;
	}
	public void setMaleDominant(Lion maleDominant) {
		this.maleDominant=maleDominant;
	}
	//setter getter femaleDominant
	public Lion getmFemaleDominante() {
		return this.femaleDominante;
	}
	public void setFemaleDominante(Lion femaleDominante) {
		this.femaleDominante=femaleDominante;
	}	

	
	//setter getter puissance
	public String getPuissance() {
		return this.puissance;
	}
	public void setPuissance(String puissance) {
		this.puissance=puissance;
	}
	
	
	public void afficheCaractéristiqueGroupe() {
		// TODO Auto-generated method stub
		System.out.println("lE groupe est composé de "+this.tailleMale+" lion(s) "+this.tailleFemale+" lionne(s)");
		System.out.println("lE groupe habite dans la zone: "+this.zone);
		System.out.println();
	}

	@Override
	public void afficheCaractéristiquesMembres() {
		// TODO Auto-generated method stub
		
		System.out.println("lE groupe est composé de ");
	      for(Lion elem: this.lionListe )
	       {
	       	 elem.afficheCaracteristiques();
	       }
	}


	@Override
	public void constituerCoupleDominant(int indM, int indF) {
		// TODO Auto-generated method stub
		this.maleDominant=this.lionListe.get(indM-1);
		this.femaleDominante=this.lionListe.get(indF-1);
	}

	@Override
	public void reproductionLion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void déclareLionNonDominant() {
		// TODO Auto-generated method stub
		System.out.println("lE couple dominant est:    ");
		  this.maleDominant.afficheCaracteristiques();
		  this.femaleDominante.afficheCaracteristiques();
	}

	public void ajoutMembre(Lion lion) {
		// TODO Auto-generated method stub
		this.lionListe.add(lion);
	}
	
	public void enleverMembre(int i) {
		this.lionListe.remove(i-1);
	}


 

}
