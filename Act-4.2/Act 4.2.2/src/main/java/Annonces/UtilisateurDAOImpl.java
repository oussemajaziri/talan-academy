package Annonces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurDAOImpl implements UtilisateurDAO {

	// function signup
	@Override
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
	@Override
	public boolean login(String mail, String pwd) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		
		if (conn == null) {
			return false;
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
		
		return verifConnection;
	}

	// function Update user by Id
	@Override
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

	// function get User by Id
	@Override
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

}
