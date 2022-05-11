package Annonces;
import java.sql.Date;

public class Favoris {

	private int id;
	private int annonceId;
	private int userId;
	private Date dateAjout;

	public Favoris() {

	}

	public Favoris(int id, int annonceId, int userId, Date dateAjout) {
		this.id = id;
		this.annonceId = annonceId;
		this.userId = userId;
		this.dateAjout = dateAjout;
	}

	public Favoris(int annonceId, int userId, Date dateAjout) {

		this.annonceId = annonceId;
		this.userId = userId;
		this.dateAjout = dateAjout;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnnonceId() {
		return annonceId;
	}

	public void setAnnonceId(int annonceId) {
		this.annonceId = annonceId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	@Override
	public String toString() {
		return "Favoris [annonceId=" + annonceId + ", userId=" + userId + ", dateAjout=" + dateAjout + "]";
	}

}
