
public class PlayListelmpl implements PlayListe {
	
	public final int maxMusique = 10;
	private String nom;
	private String genre;
	private int nombreTitres;
	private Musiquelmpl[] tableauMusique = new Musiquelmpl[maxMusique];
	
	//constactor par defaut
	public PlayListelmpl () {
		
	}
	
	//constactor parametré
	public PlayListelmpl (String nom, String genre, int nombreTitres, Musiquelmpl[] tableauMusique) {
		this.nom=nom;
		this.genre=genre;
		this.nombreTitres=nombreTitres;
		this.tableauMusique=tableauMusique;
	}

	
	//getter maxMusique
	public int getMaxMusique() {
		return maxMusique;
	}
	//setter getter nom
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	//setter getter genre
	public String getGenre() {
		return genre;
	}
	public void setgenre(String genre) {
		this.genre = genre;
	}
	
	//setter getter nombreTitres
	public int getNombreTitres() {
		return nombreTitres;
	}
	public void setNombreTitres(int nombreTitres) {
		this.nombreTitres = nombreTitres;
	}
	
	//setter getter tableauMusique
	public Musiquelmpl[] getTableauMusique() {
		return tableauMusique;
	}
	public void setTableauMusique(Musiquelmpl[] tableaMusique) {
		this.tableauMusique = tableaMusique;
	}	
	
	
	@Override
	public void affichePlayListeMusique() {};
	@Override
	public void ajouMusique() {};
	@Override
	public void elimineDoublons() {};
	@Override
	public void autrePlayListe() {};
	@Override
	public void triParAuteur() {};
	@Override
	public void triParInterprete() {};
	
}
