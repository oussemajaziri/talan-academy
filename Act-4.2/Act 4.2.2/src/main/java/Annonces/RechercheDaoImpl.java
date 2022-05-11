package Annonces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RechercheDaoImpl implements RechercheDAO {

	// function create Recherche
	@Override
	public void createRecherche(int categoryId, String taille, String couleur, Double minPrice, Double maxPrice,int userId) {

		Recherche recherche = new Recherche(categoryId, taille,couleur, minPrice, maxPrice, userId);
		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "INSERT INTO RECHERCHE (category_id ,taille ,couleur ,prix_mini ,prix_maxi ,user_id ) VALUES (?,?,?,?,?,?);";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setInt(1, recherche.getCategoryId());
			preparedStatement.setString(2, recherche.getTaille());
			preparedStatement.setString(3, recherche.getCouleur());
			preparedStatement.setDouble(4, recherche.getMinPrice());
			preparedStatement.setDouble(5, recherche.getMaxPrice());
			preparedStatement.setInt(6, recherche.getUserId());

			preparedStatement.executeUpdate();

			System.out.println("Recherche added");

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
	
	
	// function Deletee recherche
	@Override
	public void deleteRechercheById(int id) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "DELETE FROM recherche where id=?";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			System.out.println("recherche deleted");

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
	
	
	// function lancer Recherche
	@Override
	public void lancerRecherche(int id) {

		ConnectionManager connectionManager = ConnectionManager.getInstance();
		Connection conn = connectionManager.getConnection();

		if (conn == null) {
			return;
		}

		String querry = "SELECT * FROM recherche WHERE id = ?";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				
			    Recherche recherche = new Recherche();
			    recherche.setId(resultSet.getInt("id"));
			    recherche.setMinPrice(resultSet.getDouble("prix_mini"));
			    recherche.setMaxPrice(resultSet.getDouble("prix_maxi"));
			    
			   
				System.out.println("annonce existe dans favoris " + " mini_prix : " + recherche.getMinPrice() + " prix_maxi : " +recherche.getMaxPrice() );
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
