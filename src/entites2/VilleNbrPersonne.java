package entites2;

	public class VilleNbrPersonne implements Comparable<VilleNbrPersonne> {
		private String nom;
		private int nbHabitants;

		public VilleNbrPersonne(String nom, int nbHabitants) {
			this.nom = nom;
			this.nbHabitants = nbHabitants;
		}

		public int compareTo(VilleNbrPersonne autre) {
			if(this.nbHabitants > autre.getNbHabitants()) {
				return 1;
			} if(this.nbHabitants < autre.getNbHabitants()) {
				return -1;
			}
			return 0;
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


