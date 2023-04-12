package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	
	
	private int tauxDeRemuneration;

	public CompteTaux(String numéroDeCompte, int solde, int tauxDeRemuneration) {
		super(numéroDeCompte, solde);
		this.tauxDeRemuneration = tauxDeRemuneration;
}

	public int getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(int tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	@Override
	public String toString() {
		return  super.toString() + ", tauxDeRemuneration="
				+ tauxDeRemuneration + "]";
	}



	
}
