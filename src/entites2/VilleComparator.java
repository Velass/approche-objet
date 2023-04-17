package entites2;

import java.util.Comparator;

public class VilleComparator implements Comparator<Ville> {

	

	public int compare(Ville autre1, Ville autre2) {
		if(autre1.getNbHabitants() > autre2.getNbHabitants()) {
			return 1;
		} if(autre1.getNbHabitants() < autre2.getNbHabitants()) {
			return -1;
		}
		return 0;
	}


}


