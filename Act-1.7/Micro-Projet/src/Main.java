
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ajouter instance lion de la classse Lion
		Lion lion= new Lion ();
		lion.setSexe();
		lion.setCategorieAge();
		lion.setForce();
		lion.setGroupe();
		lion.setFacteurDomination();
		lion.setRangDomination();
		lion.setFacteurImpetuosite();
		
		//afficher l'instance lion
		System.out.println(lion);
		lion.chasser();
		lion.senourrir();
		lion.emettreSon();
		
		//Ajouter instance ours de la classse Ours
		Ours ours= new Ours ();
		ours.setSexe();
		ours.setCategorieAge();
		ours.setForce();
		ours.setGroupe();
		ours.setFacteurAgressivite();
		ours.setPuissance();
		ours.setStatutHivernation();
		
		//afficher l'instance ours
		System.out.println(ours);
	 
		
	}

}
