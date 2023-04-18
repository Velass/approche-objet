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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCodedpt() {
		return codedpt;
	}

	public void setCodedpt(int codedpt) {
		this.codedpt = codedpt;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopTotal() {
		return popTotal;
	}

	public void setPopTotal(int popTotal) {
		this.popTotal = popTotal;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", codedpt=" + codedpt + ", nomRegion=" + nomRegion + ", popTotal=" + popTotal
				+ "]";
	}

}
