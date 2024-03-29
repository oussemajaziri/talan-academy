import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AnnonceDAOImpl implements AnnonceDAO {

	// function get all annoncements
	@Override
	public void getAnnouncements() {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		if (conn == null) {
			return;
		}
		List<AnnouncementImpl> announcements = new ArrayList<>();

		String querry = "SELECT * FROM announcement;";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				AnnouncementImpl annonce = new AnnouncementImpl(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getInt(4), resultSet.getDouble(5), resultSet.getString(6),
						resultSet.getDate(7), resultSet.getBoolean(8), resultSet.getInt(9), resultSet.getString(10),
						resultSet.getInt(11));

				announcements.add(annonce);

			}
		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {

			try {
				conn.close();

			} catch (SQLException ex) {

				ex.printStackTrace();
			}
		}

		System.out.println("");
		System.out.println("Liste des annonces");
		for (AnnouncementImpl annonce : announcements) {
			System.out.println("annonce: " + annonce.getTitle() + annonce.getDescription() + " category id : "
					+ annonce.getCategory() + " prix est " + annonce.getPrice() + " publi�e le : "
					+ annonce.getPubDate() + " Disponibility : " + annonce.isDisponibility() + " nbre de vues : "
					+ annonce.getNbrViews() + " localisation : " + annonce.getLocalisation() + " vendeur id : "
					+ annonce.getUserId());
			System.out.println();
		}
	}

	// get vendeur Id
	@Override
	public Integer getUserIdByAnnonceId(int annonceId) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return null;
		}

		String querry = "SELECT *FROM announcement WHERE id=?;";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, annonceId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				AnnouncementImpl annonce = new AnnouncementImpl(resultSet.getInt("id"), resultSet.getString(2),
						resultSet.getString(3), resultSet.getInt(4), resultSet.getDouble(5), resultSet.getString(6),
						resultSet.getDate(7), resultSet.getBoolean(8), resultSet.getInt(9), resultSet.getString(10),
						resultSet.getInt(11));

				return annonce.getUserId();
			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// function get Seller by Id
	@Override
	public void getSellerInfo(int id) {

		int userId = getUserIdByAnnonceId(id);
		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "SELECT *FROM users WHERE id=?;";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, userId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				UserImpl utilisateur = new UserImpl(resultSet.getInt("id"), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4), resultSet.getString(6), resultSet.getString(5),
						resultSet.getString(7), resultSet.getString(9), 1);
				System.out.println("Nom du vendeur : " + utilisateur.getFirstName() + " " + utilisateur.getLastName()
						+ " son adresse " + utilisateur.getAdress() + " telephone : " + utilisateur.getPhone());
			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return;
	}

	// function create announcement
	@Override
	public void addAnnouncement(int userId, String title, String description, int category, double price,
			String picture, Date pubDate, boolean disponibility, int nbrViews, String localisation) {

		AnnouncementImpl annonce = new AnnouncementImpl(title, description, category, price, picture, pubDate,
				disponibility, nbrViews, localisation, userId);
		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "INSERT INTO announcement (title,description,category_id,price,picture,publication_date,is_available,view_number,localisation,user_id) VALUES (?,?,?,?,?,?,?,?,?,?);";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setString(1, annonce.getTitle());
			preparedStatement.setString(2, annonce.getDescription());
			preparedStatement.setInt(3, annonce.getCategory());
			preparedStatement.setDouble(4, annonce.getPrice());
			preparedStatement.setString(5, annonce.getPicture());
			preparedStatement.setDate(6, annonce.getPubDate());
			preparedStatement.setBoolean(7, annonce.isDisponibility());
			preparedStatement.setInt(8, annonce.getNbrViews());
			preparedStatement.setString(9, annonce.getLocalisation());
			preparedStatement.setInt(10, userId);

			preparedStatement.executeUpdate();

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// function Deletee announcement
	@Override
	public void deleteAnnouncementById(int id) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "DELETE FROM announcement where id=?";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// function Update announcement by Id
	@Override
	public void updateAnnouncementById(AnnouncementImpl annonce) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		if (annonce.getId() > 0) {

			String querry = "UPDATE announcement SET title=?, description=?, category_id=?, price=?, picture=?, publication_date=? ,is_available=?, view_number=?, localisation=?, user_id=?  WHERE id=?;";

			try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
				preparedStatement.setString(1, annonce.getTitle());
				preparedStatement.setString(2, annonce.getDescription());
				preparedStatement.setInt(3, annonce.getCategory());
				preparedStatement.setDouble(4, annonce.getPrice());
				preparedStatement.setString(5, annonce.getPicture());
				preparedStatement.setDate(6, annonce.getPubDate());
				preparedStatement.setBoolean(7, annonce.isDisponibility());
				preparedStatement.setInt(8, annonce.getNbrViews());
				preparedStatement.setString(9, annonce.getLocalisation());
				preparedStatement.setInt(10, annonce.getUserId());
				preparedStatement.setInt(11, annonce.getId());

				preparedStatement.executeUpdate();

			} catch (SQLException ex) {

				ex.printStackTrace();

			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// searche by name and category
	@Override
	public void searchAnnonceByNameAndCategory(String name, int categoryId) {
		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		if (conn == null) {
			return;
		}

		List<AnnouncementImpl> announcements = new ArrayList<>();

		String querry = "SELECT * FROM announcement WHERE title  = ? AND category_id=? ";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, categoryId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				AnnouncementImpl annonce = new AnnouncementImpl(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getInt(4), resultSet.getDouble(5), resultSet.getString(6),
						resultSet.getDate(7), resultSet.getBoolean(8), resultSet.getInt(9), resultSet.getString(10),
						resultSet.getInt(11));

				announcements.add(annonce);

			}
		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("Liste des annonces trouv�es ");
		for (AnnouncementImpl annonce : announcements) {
			System.out.println("annonce: " + annonce.getTitle() + annonce.getDescription() + " category id : "
					+ annonce.getCategory() + " prix est " + annonce.getPrice() + " publi�e le : "
					+ annonce.getPubDate() + " Disponibility : " + annonce.isDisponibility() + " nbre de vues : "
					+ annonce.getNbrViews() + " localisation : " + annonce.getLocalisation() + " vendeur id : "
					+ annonce.getUserId());
			System.out.println();
		}
	}

	// searche by localisation
	@Override
	public void searchAnnonceByLocalisation(String localisation) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		if (conn == null) {
			return;
		}

		List<AnnouncementImpl> announcements = new ArrayList<>();

		String querry = "SELECT * FROM announcement WHERE   localisation  LIKE ?";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setString(1, "%" + localisation + "%");
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				AnnouncementImpl annonce = new AnnouncementImpl(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getInt(4), resultSet.getDouble(5), resultSet.getString(6),
						resultSet.getDate(7), resultSet.getBoolean(8), resultSet.getInt(9), resultSet.getString(10),
						resultSet.getInt(11));

				announcements.add(annonce);

			}
		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("Liste des annonces trouv�es ");
		for (AnnouncementImpl annonce : announcements) {
			System.out.println("annonce: " + annonce.getTitle() + annonce.getDescription() + " category id : "
					+ annonce.getCategory() + " prix est " + annonce.getPrice() + " publi�e le : "
					+ annonce.getPubDate() + " Disponibility : " + annonce.isDisponibility() + " nbre de vues : "
					+ annonce.getNbrViews() + " localisation : " + annonce.getLocalisation() + " vendeur id : "
					+ annonce.getUserId());
			System.out.println();
		}
	}

	// trier par prix
	@Override
	public void triAnnonesParPrix(Double prixMin, Double prixMax) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		if (conn == null) {
			return;
		}

		ArrayList<AnnouncementImpl> announcements = new ArrayList<>();

		String querry = "SELECT * FROM announcement WHERE price BETWEEN ? AND ?  ORDER BY price";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setDouble(1, prixMin);
			preparedStatement.setDouble(2, prixMax);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				AnnouncementImpl annonce = new AnnouncementImpl(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getInt(4), resultSet.getDouble(5), resultSet.getString(6),
						resultSet.getDate(7), resultSet.getBoolean(8), resultSet.getInt(9), resultSet.getString(10),
						resultSet.getInt(11));

				announcements.add(annonce);

			}
		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("annonces tri�es par prix :  ");
		for (AnnouncementImpl annonce : announcements) {
			System.out.println("annonce: " + annonce.getTitle() + annonce.getDescription() + " category id : "
					+ annonce.getCategory() + " prix est " + annonce.getPrice() + " publi�e le : "
					+ annonce.getPubDate() + " Disponibility : " + annonce.isDisponibility() + " nbre de vues : "
					+ annonce.getNbrViews() + " localisation : " + annonce.getLocalisation() + " vendeur id : "
					+ annonce.getUserId());
			System.out.println();
		}
	}

	// function show user annoncements view
	@Override
	public void getUsersAnnocementsView(int userid) {

		int id = userid;
		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "SELECT *FROM announcement WHERE user_id=?;";

		HashMap<String, Integer> announcements = new HashMap<String, Integer>();
		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, userid);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				announcements.put(resultSet.getString(2), resultSet.getInt(9));

			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		for (Map.Entry m : announcements.entrySet()) {
			System.out.println("Annonce  " + m.getKey() + ", nombre Vue " + m.getValue());
		}

		return;
	}

}
