package fr.diginamic.entities;

public class Cercle {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		return (rayon * 2) * Math.PI;
	}

	public double surface() {
		return (rayon * rayon) * Math.PI;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + " " + rayon + "]";
	}
}
