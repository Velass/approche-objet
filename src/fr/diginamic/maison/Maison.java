package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
	ArrayList<Piece> list1 = new ArrayList<Piece>();

public void ajouterPiece(Piece piece) {
	list1.add(piece);
}

@Override
public String toString() {
	return "Maison [list1=" + list1 + "]";
}
}
