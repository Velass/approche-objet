package fr.diginamic.banque.entites;

import fr.diginamic.banque.Operation;

public class Credit extends Operation {

	public Credit(String dateOpe, int montantOpe) {
		super(dateOpe, montantOpe);

	}

	public String getType() {
		return "Credit";
	}
}
