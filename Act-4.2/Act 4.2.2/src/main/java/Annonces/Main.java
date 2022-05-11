package Annonces;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			System.out.println("Not Connected");
		} else {
			System.out.println("Connected");
		}

		System.out.println("");

		UtilisateurDAOImpl utilisateurDAOImpl = new UtilisateurDAOImpl();
		AnnonceDAOImpl annonceDAOImpl = new AnnonceDAOImpl();
		FavorisDAOImpl favorisDAOImpl = new FavorisDAOImpl();
		RechercheDaoImpl rechercheDaoImpl = new RechercheDaoImpl();

		// create accounte
		utilisateurDAOImpl.signUp("firstName", "lastName", "tester", "mai@test", "11111", "33333333", "adress test");

		// connecter
		utilisateurDAOImpl.login("mai@test", "11111");

		// mise à jour ses info
		UserImpl user1 = new UserImpl(6, "newfirstName", "newlastName", "newtester", "newmai@test", "2222", "55555",
				"adress test", 1);

		utilisateurDAOImpl.updateUserById(user1);

		// voir tous las annonces
		annonceDAOImpl.getAnnouncements();

		// Afficher les info du vendeur
		utilisateurDAOImpl.getSellerInfo(annonceDAOImpl.getUserIdByAnnonceId(5));

		// add new announcement
		LocalDate today = LocalDate.now();
		annonceDAOImpl.addAnnouncement(7, "annonce 100", " desc annoce 2", 1, 10, "path picture", Date.valueOf(today),
				true, 0, "charguia");

		// Delete announcement by Id
		// annonceDAOImpl.deleteAnnouncementById(4);

		// update announcement
		AnnouncementImpl annonceToUpdate = new AnnouncementImpl("annonce 2", "la deusieme annonce", 3, 150, "path 2",
				Date.valueOf(today), true, 0, "soukra", 2);

		annonceDAOImpl.updateAnnouncementById(annonceToUpdate = new AnnouncementImpl(6, "annonce 3", "la 3eme annonce",
				3, 250, "path 2", Date.valueOf(today), true, 0, "soukra", 2));

		// add Favoris
		favorisDAOImpl.createFavori(1, 1, Date.valueOf(today));

		// delete un favori
		favorisDAOImpl.deleteFavoriById(3);

		// search annonce dans favoris by id
		favorisDAOImpl.searchAnnonceDansFavoris(5);

		// add recherche
		rechercheDaoImpl.createRecherche(1, "taille m", "vert", 25.0, 75.0, 1);

		// delete recherche by Id
		rechercheDaoImpl.deleteRechercheById(1);

		// lancer recherche
		rechercheDaoImpl.lancerRecherche(2);

		// chercher annonce par nom et category
		annonceDAOImpl.searchAnnonceByNameAndCategory("t-shirt lacuste bon ‚tat", 1);

		// chercher annonce par localisation
		annonceDAOImpl.searchAnnonceByLocalisation("aris");

		// filter annonce par prix
		annonceDAOImpl.triAnnonesParPrix(9.9, 90.1);

		// show nbr views for users announcement
		annonceDAOImpl.getUsersAnnocementsView(2);

	}

}
