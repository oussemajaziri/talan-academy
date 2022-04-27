import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FavorisDAOImpl implements FavorisDAO {

	// function create createFavori
	@Override
	public void createFavori(int annonceId, int userId, Date date) {

		Favoris favoris = new Favoris(annonceId, userId, date);
		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "INSERT INTO favoris (annonce_id, user_id, favory_date) VALUES (?,?,?);";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setInt(1, favoris.getAnnonceId());
			preparedStatement.setInt(2, favoris.getUserId());
			preparedStatement.setDate(3, favoris.getDateAjout());

			preparedStatement.executeUpdate();

			System.out.println("favoris added");

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

	// function Deletee favori
	@Override
	public void deleteFavoriById(int id) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "DELETE FROM favoris where id=?";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			System.out.println("favoris deleted");

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

	// function chercher annonce dans favori
	@Override
	public void searchAnnonceDansFavoris(int annonceId) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		if (conn == null) {
			return;
		}

		String querry = "SELECT * FROM favoris WHERE annonce_id = ?";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setInt(1, annonceId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println("annonce existe dans favoris");
			} else {
				System.out.println("annonce n'existe pas dans favoris");
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

	}

}
