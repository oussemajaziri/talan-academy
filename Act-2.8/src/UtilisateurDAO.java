
public interface UtilisateurDAO {

	// function signup
	public void signUp(String firstName, String lastName, String pseudo, String mail, String password, String phone,
			String adress);

	// function login
	public void login(String mail, String pwd);

	// function Update user by Id
	public void updateUserById(UserImpl utilisateur);

	// function get User by Id
	public void getSellerInfo(int id);

}
