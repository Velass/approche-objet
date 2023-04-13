package fr.diginamic.banque;

import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Credit;

public abstract class TestOperation {

	public static void main(String[] args) {
		Debit debit1 = new Debit("02/01/2022", 100);
		Debit debit2 = new Debit("02/01/2023", 120);
		Credit credit1 = new Credit("02/01/2024", 110);
		Credit credit2 = new Credit("02/01/2025", 100);
		int total = 0;
		Operation[] tabOpe = { debit1, debit2, credit1, credit2 };
		for (int i = 0; i < tabOpe.length; i++) {
			System.out.println(tabOpe[i]);
			if (tabOpe[i].getType().equals( "Credit")) {
				total += tabOpe[i].montantOpe;
			} else {
				total -= tabOpe[i].montantOpe;
			}
			System.out.println(total);
		}

	}
}
