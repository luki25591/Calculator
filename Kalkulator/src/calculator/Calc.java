package calculator;

public class Calc {
	private double a;
	private double b;
	private double h;
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double objetoscProstopadloscianu() {
		return (a * b * h);
	}

	public double poleProstopadloscianu() {
		return (2 * a * b) + (2 * a * h) + (2 * b * h);
	}

}
