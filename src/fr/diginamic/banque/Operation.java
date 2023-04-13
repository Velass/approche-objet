package fr.diginamic.banque;

public abstract class Operation {
	String dateOpe;
	int montantOpe;

	public Operation(String dateOpe, int montantOpe) {
		this.dateOpe = dateOpe;
		this.montantOpe = montantOpe;
	}

	public abstract String getType();

	@Override
	public String toString() {
		return "Operation [dateOpe=" + dateOpe + ", montantOpe=" + montantOpe +" "+ getType() + "]";
	}
}
