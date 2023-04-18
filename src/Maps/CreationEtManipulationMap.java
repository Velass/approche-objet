package Maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(69, "Lyon");
		mapVilles.put(59, "Lille");
		mapVilles.put(33, "Bordeaux");
		//for(int i = 0; i<mapVilles.size(); i++) {
			//System.out.println(mapVilles.keySet());
			//System.out.println(mapVilles.values());
		//}
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		Iterator<String> ValueIte = mapVilles.values().iterator();
		
		while (keysIte.hasNext()) {
		Integer key = keysIte.next();
		String value = ValueIte.next();
		System.out.println("key" + " " +key);
		System.out.println("Valeur" + " " +value);
		// ...
		}
		System.out.println(mapVilles.size());
	}

}
