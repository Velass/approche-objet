package entites;

public class Theatre {
	String nom;
	int capMax;
	int totalClientsInscrit;
	int recetteEntreprise;

	public Theatre(String nom, int capMax, int totalClientsInscrit, int recetteEntreprise) {
		this.nom = nom;
		this.capMax = capMax;
		this.totalClientsInscrit = totalClientsInscrit;
		this.recetteEntreprise = recetteEntreprise;
	}

	public void inscrire(int nbrClient, int prixPlace) {
		if (totalClientsInscrit < capMax) {
			totalClientsInscrit += nbrClient;
			recetteEntreprise += prixPlace;
		} else {
			System.out.println("trop de personne");
		}

	}

	@Override
	public String toString() {
		return "Theatre [totalClientsInscrit=" + totalClientsInscrit + ", recetteEntreprise=" + recetteEntreprise + "]";
	}


	

}
