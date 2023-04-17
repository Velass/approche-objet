package fichier;

public class Ville {
	String nom;
	int codedpt;
	String nomRegion;
	int popTotal;

	public Ville(String nom, int codedpt, String nomRegion, int popTotal) {

		this.nom = nom;
		this.codedpt = codedpt;
		this.nomRegion = nomRegion;
		this.popTotal = popTotal;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", codedpt=" + codedpt + ", nomRegion=" + nomRegion + ", popTotal=" + popTotal
				+ "]";
	}

}
