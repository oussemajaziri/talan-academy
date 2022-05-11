package Annonces;
import java.sql.Date;

public interface FavorisDAO {

	// function creer favori
	public void createFavori(int annonceId, int userId, Date date);

	// function supprimer favori
	public void deleteFavoriById(int id);

	// function chercher annonce dans favori
	public void searchAnnonceDansFavoris(int annonceId);

}
