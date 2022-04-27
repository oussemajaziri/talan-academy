
public interface RechercheDAO {

	//function creer recherche
	public void createRecherche(int categoryId, String taille, String couleur, Double minPrice, Double maxPrice,int userId);
	
	//function supprimer une recherche
	public void deleteRechercheById(int id);
	
	// function lancer une recherche
	public void lancerRecherche(int rechercheId );
}
