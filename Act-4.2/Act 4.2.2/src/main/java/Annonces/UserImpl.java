package Annonces;
import java.util.ArrayList;
import java.util.List;

public class UserImpl implements User {

	private int id;
	private String firstName;
	private String lastName;
	private String pseudo;
	private String password;
	private String mail;
	private String phone;
	private String adress;
	private int roleId;
	private boolean connected;
	private List<Integer> annoncements = new ArrayList<>();
	private List<Integer> favoriteAnnoncements = new ArrayList<>();

	// Empty constructor
	public UserImpl() {
	}

	// constructor with all attributes
	public UserImpl(int id, String firstName, String lastName, String pseudo, String password, String mail,
			String phone, String adress, int roleId, List<Integer> annoncements, List<Integer> favoriteAnnoncements) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pseudo = pseudo;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
		this.adress = adress;
		this.roleId = roleId;
		this.annoncements = annoncements;
		this.favoriteAnnoncements = favoriteAnnoncements;
	}

	// Constructor without Id
	public UserImpl(String firstName, String lastName, String pseudo, String mail, String password, String phone,
			String adress, int roleId, List<Integer> annoncements, List<Integer> favoriteAnnoncements) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pseudo = pseudo;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
		this.adress = adress;
		this.roleId = roleId;
		this.annoncements = annoncements;
		this.favoriteAnnoncements = favoriteAnnoncements;
	}

	// Constructor without Id annoncements favoriteAnnoncements
	public UserImpl(String firstName, String lastName, String pseudo, String mail, String password, String phone,
			String adress, int roleId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pseudo = pseudo;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
		this.adress = adress;
		this.roleId = roleId;
	}

	// Constructor without annoncements favoriteAnnoncements
	public UserImpl(int id, String firstName, String lastName, String pseudo, String mail, String password,
			String phone, String adress, int roleId) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pseudo = pseudo;
		this.mail = mail;
		this.password = password;
		this.phone = phone;
		this.adress = adress;
		this.roleId = roleId;
	}

	// Constructor without mail and password
	public UserImpl(String mail, String password) {
		this.password = password;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public List<Integer> getAnnoncements() {
		return annoncements;
	}

	public void setAnnoncements(List<Integer> annoncements) {
		this.annoncements = annoncements;
	}

	public List<Integer> getFavoriteAnnoncements() {
		return favoriteAnnoncements;
	}

	public void setFavoriteAnnoncements(List<Integer> favoriteAnnoncements) {
		this.favoriteAnnoncements = favoriteAnnoncements;
	}

	public void affichMailPwd(UserImpl user) {
		System.out.println(user.getMail() + " " + user.getPassword());
	}

}
