package fr.diginamic.testnumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public Saison instanceSaison(String libelle ) {
		for(Saison element : Saison.values()) {
			if(element.getLibelle().equals(libelle)) {
				return element;
			}
		}
		return null;
	}
		
	


	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	@Override
	public String toString() {
		return "Saison [libelle=" + libelle + ", ordre=" + ordre + "]";
	}

	
}
