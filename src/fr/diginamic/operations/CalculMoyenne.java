package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	double[] tab = new double[0];

	public CalculMoyenne(double[] val) {
		this.tab = val;
	}

	public void ajoutTab(double val) {

		double[] nvtab = new double[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			nvtab[i] = tab[i];
			
		}
		nvtab[nvtab.length - 1] = val;

		tab = nvtab;

	}

	public double calculMoyenne() {
		double somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme / tab.length;

	}

	@Override
	public String toString() {
		return "CalculMoyenne [tab=" + Arrays.toString(tab) + "]";
	}
}
