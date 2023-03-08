
public class Guia1 {
	public static void main(String[] args) {

		// PUNTO 1 - A

		System.out.println("Numeros de 1 al 100 con WHILE:");

		int numero = 1;
		while (numero <= 100) {
			System.out.println(numero);
			numero++;
		}

		System.out.println("------------------------------");

		// PUNTO 1 - B

		System.out.println("Numeros de 1 al 100 con FOR:");

		for (numero = 1; numero <= 100; numero++) {
			System.out.println(numero);
		}

		System.out.println("------------------------------");

		// PUNTO 1 - C

		System.out.println("Numeros de 1 al 100 con DO WHILE:");

		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num <= 100);

		System.out.println("------------------------------");

		// PUNTO 1 - D

		System.out.println("Numeros del 2 al 200 (de 2 en 2) con FOR:");

		for (numero = 1; numero <= 100; numero++) {
			System.out.println(numero*2);
		}
	}
}
