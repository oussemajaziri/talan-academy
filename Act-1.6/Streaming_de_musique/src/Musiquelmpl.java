
public class Musiquelmpl implements Musique  {
	
	private String titre;
	private String auteur;
	private String interprete;
	private String genre;
	
	
	//Constractor par defaut
	public Musiquelmpl() {
	}
	
	//Constractor parametré
	public Musiquelmpl(String titre, String auteur,String interprete, String genre) {	
	}
		
	//setter getter titre
	public String getTitre() {
			return titre;
	}
	public void setTitre(String title) {
			this.titre = title;
	}
	
	//setter getter auteur
	public String getAuteur() {
		return auteur;
	}
	public void setAutheur(String auteur) {
		this.auteur = auteur;
	}
	
	//setter getter interprete
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	
	//setter getter genre
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre= genre;
	}
	
	
	@Override
	public void showMusique() {};
	
	@Override
	public void testEqualMusiqueInstance() {};
	
	
	public String toString() {
        return "La musique" + this.getTitre() + " est de genre "+this.getGenre() + " ecrite par " +this.getAuteur() +" et interprete par "+this.getInterprete();
    }
}