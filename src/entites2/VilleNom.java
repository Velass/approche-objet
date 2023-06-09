package entites2;

public class VilleNom implements Comparable<VilleNom> {
	private String nom;
	private int nbHabitants;

	public VilleNom(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public int compareTo(VilleNom autre) {
		int result = this.nom.compareTo(autre.getNom());
		return result;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}

}
