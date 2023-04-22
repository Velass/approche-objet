package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
	ArrayList<Piece> list1 = new ArrayList<Piece>();

public void ajouterPiece(Piece piece) {
	if(piece == null  ) {
		System.out.println("cette valeur est incorrecte");
	}else {
		list1.add(piece);
		
	}
}

public double calculerSuperficieTotale() {
    double superficieTotale = 0;
    for (Piece piece : list1) {
        superficieTotale += piece.getSuperficie();
    }
    return  superficieTotale;
}

public double calculerSuperficieEtage(int etage) {
    double superficieEtage = 0;
    for (Piece piece : list1) {
        if (piece.getEtage() == etage) {
            superficieEtage += piece.getSuperficie();
        }
    }
    return superficieEtage;
}

public double calculerSuperficiePiece(String piece) {
    double superficiePiece = 0;
    for (Piece element : list1) {
        if (element.getClass().getSimpleName().equals(piece)) {
        	superficiePiece += element.getSuperficie();
        }
    }
    return superficiePiece;
}

public int compterPieces(String typePiece) {
    int nbPieces = 0;
    for (Piece piece : list1) {
        if (piece.getClass().getSimpleName().equals(typePiece)) {
            nbPieces++;
        }
    }
    return nbPieces;
}


@Override
public String toString() {
	return "Maison [list1=" + list1 + "]";
}
}
