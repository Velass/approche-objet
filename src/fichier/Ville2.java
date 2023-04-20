package fichier;

import entites2.Ville;

public class Ville2 {
		private String nom;
		private int nbHabitants;
		private Continent continent;
		
		public boolean equals(Object object) {
		       if(!(object instanceof Ville)) {
		    	   return false;
		       }
		       Ville other = (Ville) object;
		       return nom != null && nom.equals(other.getNom()) &&  nbHabitants == (other.getNbHabitants());
		       
		}
		public Ville2(String nom, int nbHabitants, Continent continent) {
			this.nom = nom;
			this.nbHabitants = nbHabitants;
			this.continent= continent;
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
		public Continent getContinent() {
			return continent;
		}
		public void setContinent(Continent continent) {
			this.continent = continent;
		}
		@Override
		public String toString() {
			return "Ville2 [nom=" + nom + ", nbHabitants=" + nbHabitants + ", continent=" + continent + "]";
		}

	

	}
