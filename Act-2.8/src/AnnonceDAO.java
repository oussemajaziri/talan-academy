import java.sql.Date;
import java.util.List;

public interface AnnonceDAO {

	// function get all annoncements
	public void getAnnouncements();

	// get vendeur Id
	public Integer getUserIdByAnnonceId(int annonceId);

	// function get Seller by Id
	public void getSellerInfo(int id);

	// function create announcement
	public void addAnnouncement(int userId, String title, String description, int category, double price,
			String picture, Date pubDate, boolean disponibility, int nbrViews, String localisation);

	// function Deletee announcement
	public void deleteAnnouncementById(int id);

	// function Update announcement by Id
	public void updateAnnouncementById(AnnouncementImpl annonce);

	// searche by name and category
	public void searchAnnonceByNameAndCategory(String name, int categoryId);

	// searche by localisation
	public void searchAnnonceByLocalisation(String localisation);

	// trier par prix
	public void triAnnonesParPrix(Double prixMin, Double prixMax);

	// function show user annoncements view
	public void getUsersAnnocementsView(int userid);

}
