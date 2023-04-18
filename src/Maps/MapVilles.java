package Maps;

import java.util.HashMap;

import entites2.Ville;

public class MapVilles {

	public static void main(String[] args) {
		int maxNumber = Integer.MAX_VALUE;
		String moinHab = null;
		Ville ville1 = new Ville("Marseille", 100);
		Ville ville2 = new Ville("Paris", 200);
		Ville ville3 = new Ville("Lyon", 50);
		HashMap<String, Ville> map = new HashMap<>();
		// association d'une clé à chaque élément
		map.put("Marseille", ville1);
		map.put("Paris", ville2);
		map.put("Lyon", ville3);
		System.out.println(map);
		
		for(Ville element: map.values()) {
			//System.out.println(element.getNbHabitants());
			if(element.getNbHabitants() < maxNumber) {
				maxNumber = element.getNbHabitants();
				moinHab = element.getNom();
			} 
				
		}
		
			if(moinHab != null ) {
				map.remove(moinHab);
			}
		System.out.println(maxNumber);
		System.out.println(moinHab);
		System.out.println(map);
		
	}

}
