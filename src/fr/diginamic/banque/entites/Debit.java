package fr.diginamic.banque.entites;

import fr.diginamic.banque.Operation;

public class Debit extends Operation {

	public Debit(String dateOpe, int montantOpe) {
		super(dateOpe, montantOpe);

	}

	public String getType() {
		return "Debit";
	}
}
