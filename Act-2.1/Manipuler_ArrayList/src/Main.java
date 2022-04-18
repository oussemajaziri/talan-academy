import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> listAnimaux = new ArrayList();
		listAnimaux.add("Lion");
		listAnimaux.add("Tiger");
		listAnimaux.add("Cat");
		listAnimaux.add("Dog");
		
		System.out.println(listAnimaux);
		
		listAnimaux.add(2,"Elephant");
		
		System.out.println(listAnimaux);
		
		listAnimaux.addAll(listAnimaux);
		
		System.out.println(listAnimaux);
		System.out.println("Taille du tableau : " + listAnimaux.size());
		
		supIndex(listAnimaux,4);
		supNom(listAnimaux,"Tiger");
		
		searchByIndex(listAnimaux,3);
		
		searchByName(listAnimaux,"Lion");
		searchByName(listAnimaux,"giraffe");
		
		Collections.sort(listAnimaux); 
		System.out.println(listAnimaux);
		
		listAnimaux.sort(Comparator.naturalOrder());
		System.out.println(listAnimaux);
		
	}
	
	public static void supIndex (List<String> list, int index) {
		System.out.println("Supression de l'élement numero : " + index);
		System.out.println("Supression de l'élement : " + list.get(index-1));
		list.remove(index-1);
		System.out.println(list);
		System.out.println("Taille du tableau : " + list.size());
	}

	public static void supNom (List<String> list, String nom) {
		System.out.println("Supression de l'animal (nom) : " + nom);
		list.removeAll(Collections.singleton("Tiger"));
		System.out.println(list);
		System.out.println("Taille du tableau : " + list.size());
	}
	
	public static void searchByIndex (List<String> list, int index) {
		String res = list.get(index-1);
		System.out.println("l'animal numéro : " + index +" est : "+ res);
	}
	
	public static void searchByName (List<String> list, String name) {   
		boolean search = list.contains(name);
		int index = list.indexOf(name);
		if (search == true) {
			System.out.println("l'animal : " + name +" existe à la position "+ (index+1));  //rendre position de la prémiere apparition
		} else {
			System.out.println("l'animal : " + name +" n'existe pas.");
		}
		
	
	}
}
