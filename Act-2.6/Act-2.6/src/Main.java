import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {

		Connection conn = ConnectionManager.getConnection();
		if (conn == null) {
			System.out.println("Not Connected");
		} else {
			System.out.println("Connected");
		}

		
		System.out.println("");
		
		
		AnnouncementManager announcementManager = new AnnouncementManager();
		
		//create accounte
		announcementManager.signUp("firstName","lastName", "tester", "mai@test", "11111", "33333333","adress test");
		
		//connecter
		//announcementManager.login("mai@test","11111");
		
		//mise à jour ses info
		//UserImpl user1 = new UserImpl (6,"newfirstName","newlastName", "newtester", "newmai@test", "2222", "55555","adress test",1);
		
		//announcementManager.updateUserById(user1);
		
		//voir tous las annonces
		announcementManager.getAnnouncements();
		
		//Afficher les info du vendeur
		//announcementManager.getSellerInfo(1);
		
		//add new announcement 
		LocalDate today = LocalDate.now();
		announcementManager.addAnnouncement(7, "nouvelle annonce", "nouvelle description", 1, 99,"path picture",Date.valueOf(today), true, 0, "tunis");

		//Delete announcement by Id
		//announcementManager.deleteAnnouncementById(4);
		
		//update announcement
		AnnouncementImpl annonceToUpdate = new AnnouncementImpl("annonce 2", "la deusieme annonce", 3, 150, "path 2", Date.valueOf(today),
				true, 0, "soukra",2);
		
		announcementManager.updateAnnouncementById(annonceToUpdate = new AnnouncementImpl(6,"annonce 3", "la 3eme annonce", 3, 250, "path 2", Date.valueOf(today),
				true, 0, "soukra",2));
	}

}
