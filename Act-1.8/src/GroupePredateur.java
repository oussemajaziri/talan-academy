import java.util.Scanner;
import java.util.*; 

public abstract class GroupePredateur implements GroupePredateurAction {

	protected int tailleMale;
	protected int tailleFemale;
	protected String zone;
	protected List<Predateur> predateursListe = new ArrayList<Predateur>();

	//Constructeur par defaut
	public  GroupePredateur () {
		
	}
	
	//constructeur
	public GroupePredateur (int tailleMale,int tailleFemale, String zone) {
		this.tailleMale=tailleMale;
		this.tailleFemale=tailleFemale;
		this.zone=zone;
	}

	public GroupePredateur (List<Predateur> predateursListe) {
		this.predateursListe=predateursListe;
	}
	
	//setter getter tailleMale
	public int getTailleMale() {
		return this.tailleMale;
	}
	public void setTailleMale(int tailleMale) {
		this.tailleMale=tailleMale;
	}
	
	//setter getter tailleFemale
	public int getTailleFemale() {
		return this.tailleFemale;
	}
	public void setTailleFemale(int tailleFemale) {
		this.tailleFemale=tailleFemale;
	}
	
	//setter getter zone
	public String getZone() {
		return this.zone;
	}
	public void setZone(String zone) {
		this.zone=zone;;
	}
	
	@Override
	public void ajoutMembre(Predateur predateur) {
		// TODO Auto-generated method stub
		this.predateursListe.add(predateur);
	}
	
	@Override
	public void enleverMembre(Predateur predateur) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afficheCaractéristiqueGroupe () {
		System.out.println("le groupe contien " + tailleMale + " male " + tailleFemale);
		
	}
	@Override
	
	public void afficheCaractéristiquesMembres () {
		
	};
	
}
