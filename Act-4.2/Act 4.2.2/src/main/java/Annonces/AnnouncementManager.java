
/**
 
 
 
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnnouncementManager {

	
	// function signup
	public void signUp(String firstName, String lastName, String pseudo, String mail, String password, String phone,
			String adress) {

		UserImpl user = new UserImpl(firstName, lastName, pseudo, mail, password, phone, adress, 1);

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "INSERT INTO users (first_name, last_name, pseudo, mail, u_password, phone, address, role_id) VALUES (?,?,?,?,?,?,?,?);";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getPseudo());
			preparedStatement.setString(4, user.getMail());
			preparedStatement.setString(5, user.getPassword());
			preparedStatement.setString(6, user.getPhone());
			preparedStatement.setString(7, user.getAdress());
			preparedStatement.setInt(8, 1);

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

	
	// function login
	public void login(String mail, String pwd) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		if (conn == null) {
			return;
		}
		List<UserImpl> users = new ArrayList<>();

		String querry = "SELECT * FROM users;";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				UserImpl utilisateur = new UserImpl(resultSet.getString(5), resultSet.getString(6));
				users.add(utilisateur);

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

		boolean verifConnection = false;

		for (UserImpl utilisateur : users) {

			System.out.println(utilisateur.getMail());
			System.out.println(utilisateur.getPassword());
			System.out.println(" ");

			if ((utilisateur.getMail()).equals(mail) && (utilisateur.getPassword()).equals(pwd)) {
				System.out.println("test");
				verifConnection = true;
			}

		}

		if (verifConnection) {
			System.out.println("You are connected");
		} else {
			System.out.println("verifier ton email et mot de passe");
		}
	}

	// function Update user by Id
	public void updateUserById(UserImpl utilisateur) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		if (utilisateur.getId() > 0) {

			String querry = "UPDATE users SET first_name=?, last_name=?, pseudo=?, mail=?, u_password=?, phone=? ,address=?  WHERE id=?;";

			try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
				preparedStatement.setString(1, utilisateur.getFirstName());
				preparedStatement.setString(2, utilisateur.getLastName());
				preparedStatement.setString(3, utilisateur.getPseudo());
				preparedStatement.setString(4, utilisateur.getMail());
				preparedStatement.setString(5, utilisateur.getPassword());
				preparedStatement.setString(6, utilisateur.getPhone());
				preparedStatement.setString(7, utilisateur.getAdress());
				preparedStatement.setInt(8, utilisateur.getId());

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

	// function get all annoncements
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
					+ annonce.getCategory() + " prix est " + annonce.getPrice() + " publiée le : "
					+ annonce.getPubDate() + " Disponibility : " + annonce.isDisponibility() + " nbre de vues : "
					+ annonce.getNbrViews() + " localisation : " + annonce.getLocalisation() + " vendeur id : "
					+ annonce.getUserId());
			System.out.println();
		}
	}

	// get vendeur Id
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

	// function get User by Id
	public void getSellerInfo(int userId) {

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

}



*/
