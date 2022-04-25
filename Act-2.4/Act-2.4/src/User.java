import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private String prenom;
	private String nom;
	private String adresse;
	private int numTel;
	private String email;
	private List<Rent> rentList = new ArrayList<Rent>();

	public User() {
	}

	public User(int id, String prenom, String nom, String adresse, int numTel, String email, List<Rent> rentList) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.numTel = numTel;
		this.email = email;
		this.rentList = rentList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Rent> getRentList() {
		return rentList;
	}

	public void setRentList(ArrayList<Rent> rentList) {
		this.rentList = rentList;
	}

	public void afficheUser(User user) {
		System.out.println(" L'utilisateur est " + user.prenom + " " + user.nom);
	}

	public boolean compareDeuxUsers(User user1, User user2) {
		if (user1.nom.equals(user2.nom) && user1.prenom.equals(user2.prenom) && user1.adresse.equals(user2.adresse)
				&& user1.email.equals(user2.email) && user1.numTel == user2.numTel
				&& user1.rentList.equals(user2.rentList)) {
			return true;
		} else {
			return false;
		}
	}
}
