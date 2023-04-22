package fr.diginamic.maison;

public abstract class Piece  {
	private double superficie;
	private int etage = 0;

	public Piece(double superficie, int etage) {
		if(superficie < 0 || etage < 0) {
			System.out.println("veuiller mettre une donnée valide");
		}else {
			this.superficie = superficie;
			this.etage = etage;
		}

	}
	

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	@Override
	public String toString() {
		return "Piece [superficie=" + superficie + ", etage=" + etage + "]";
	}


	
	
}
