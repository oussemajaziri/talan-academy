package Annonces;
public class Recherche {

	private int id;
	private int categoryId;
	private String taille;
	private String couleur;
	private Double minPrice;
	private Double maxPrice;
	private int userId;

	public Recherche() {
		super();
	}

	public Recherche(int id, int categoryId, String taille, String couleur, Double prix_mini, Double prix_maxi,
			int userId) {
		this.id = id;
		this.categoryId = categoryId;
		this.taille = taille;
		this.couleur = couleur;
		this.minPrice = prix_mini;
		this.maxPrice = prix_maxi;
		this.userId = userId;
	}

	public Recherche(int categoryId, String taille, String couleur, Double prix_mini, Double prix_maxi, int userId) {
		this.categoryId = categoryId;
		this.taille = taille;
		this.couleur = couleur;
		this.minPrice = prix_mini;
		this.maxPrice = prix_maxi;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
