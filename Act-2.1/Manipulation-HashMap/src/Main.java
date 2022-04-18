import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Map numberMapping = new HashMap();
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		System.out.println(numberMapping);
		
		
		Map nameCity = new HashMap();
		nameCity.put("Steve","London");
		nameCity.put("John","New York");
		nameCity.put("Rajeev","Bengaluru");
		System.out.println(nameCity);
		
		verifEmpty(nameCity);
		mapTaille(nameCity);
		verifKey(nameCity,"Steve");
		verifKey(nameCity,"Slah");
		verifValue(nameCity,"London");
		verifValue(nameCity,"Rome");
		recupValue(nameCity,"Steve");
		recupValue(nameCity,"smith");
		System.out.println(nameCity);
		modifValue(nameCity,"John");
		System.out.println(nameCity);
		
		suppressionValueByKey(nameCity);
		System.out.println(nameCity);
		
		suppressionKeyAndValue(nameCity);
		System.out.println(nameCity);
		
	}
	
	public static void verifEmpty (Map map) {
		if (map.isEmpty()==true) {
			System.out.println("Le hashMap est vide");
		} else {
			System.out.println("le HashMap n'est pas vide");
		}
	}
	
	public static void mapTaille (Map map) {
		int taille = map.size();
		System.out.println("La taille de la Map est : "+taille);
	}
	
	public static void verifKey (Map map, String key) {
		boolean esxistance = map.containsKey(key);
		if (esxistance==true) {
			System.out.println("Le key "+ key + " existe");
		}else {
			System.out.println("Le key "+ key + " n'existe pas");
		}
	}
	
	
	public static void verifValue (Map map, String val) {
		boolean esxistance = map.containsValue(val);
		if (esxistance==true) {
			System.out.println("La valeur "+ val + " existe");
		}else {
			System.out.println("Le valeur "+ val + " n'existe pas");
		}
	}

	public static void recupValue (Map map, String key) {
		Object res=map.get(key);
		if (res!=null) {
			System.out.println("La valeur de "+ key + " est "+res);
		}else {
			System.out.println("Key n'existe pas");
		}
	}
	
	public static void modifValue (Map map, String key) {
		System.out.println("Modif la valeur de la clé : "+ key);
		Scanner clavier1 = new Scanner(System.in);
		String val = clavier1.nextLine();
		map.put(key, val);
	}
	
	public static void suppressionValueByKey (Map map) {
		System.out.println("Entrer le key de la valeur à supprimer : ");
		Scanner clavier2 = new Scanner(System.in);
		String key = clavier2.nextLine();
		map.remove(key);
	}
	
	public static void suppressionKeyAndValue (Map map) {
		System.out.println("Entrer le key de la valeur à supprimer : ");
		Scanner clavier3 = new Scanner(System.in);
		String key = clavier3.nextLine();
		System.out.println("Entrer la valeur à supprimer : ");
		Scanner clavier4 = new Scanner(System.in);
		String val = clavier4.nextLine();
		map.remove(key, val);
	}
}
