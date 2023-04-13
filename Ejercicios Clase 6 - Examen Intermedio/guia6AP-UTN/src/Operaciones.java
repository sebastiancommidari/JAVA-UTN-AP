
public class Operaciones {

	private double unNumero;
	private double otroNumero;

	public Operaciones() {
		unNumero = 0;
		otroNumero = 0;
	}

	public Operaciones(double unNumero, double numero2) {
		this.unNumero = unNumero;
		this.otroNumero = numero2;

	}

	public double sumar() {
		return unNumero + otroNumero;
	}

	public double restar() {

		return unNumero - otroNumero;
	}

	public double multiplicar() {

		return unNumero * otroNumero;
	}

	public double dividir() {

		return unNumero / otroNumero;
	}

}
