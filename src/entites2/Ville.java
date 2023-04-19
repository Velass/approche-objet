package entites2;


public class Ville implements Comparable<Ville> {
	private String nom;
	private int nbHabitants;
	
	public boolean equals(Object object) {
	       if(!(object instanceof Ville)) {
	    	   return false;
	       }
	       Ville other = (Ville) object;
	       return nom != null && nom.equals(other.getNom()) &&  nbHabitants == (other.getNbHabitants());
	       
	}
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	

	public int compareTo(Ville autre) {
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


