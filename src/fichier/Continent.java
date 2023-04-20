package fichier;

public enum Continent {
	EUROPE("Europe"), AFRIQUE("Afrique"), ASIE("Asie"), AMERIQUE("Amerique"), OCEANIE("Oceanie");

	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
