package fr.diginamic.operations;

public class Operations {
	double a;
	double b;
	char ch1;

	public Operations(double a, double b, char ch1) {
		this.a = a;
		this.b = b;
		this.ch1 = ch1;

	}

	public double Calcul() {
		
		if (ch1 == '+') {
			return a + b;
		} else if (ch1 == '-') {
			return a - b;
		} else if (ch1 == '*') {
			return a * b;
		} else if (ch1 == '/') {
			return a / b;
		} else {
			return ch1;
		}

	}

	@Override
	public String toString() {
		return "Operations [a=" + a + ", b=" + b + ", ch1=" + ch1 + "]";
	}

}
