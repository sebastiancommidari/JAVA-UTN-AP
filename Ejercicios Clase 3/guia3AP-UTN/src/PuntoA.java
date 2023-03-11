public class PuntoA {

	public static void main(String[] args) {

		System.out.println("a.Genere un array de números (1 al 15):");

		int unoAlQuince[] = new int[15];

		for (int i = 1; i <= 15; i++) {
			unoAlQuince[i - 1] = i;
			System.out.println(unoAlQuince[i - 1]); // Imprimo para probar que esté correcto
		}

		// Prueba del indice [0] para chequear que funcione
		// System.out.println(unoAlQuince[0]);

	}

}
