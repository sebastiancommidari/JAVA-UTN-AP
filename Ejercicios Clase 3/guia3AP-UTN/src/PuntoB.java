
public class PuntoB {

	public static void main(String[] args) {

		System.out.println("b.Al punto anterior, el valor del resultado debe incrementarse en 5:");

		int unoAlQuince[] = new int[15];

		for (int i = 1; i <= 15; i++) {
			unoAlQuince[i - 1] = i + 5;
			System.out.println(unoAlQuince[i - 1]); // Imprimo para ver que esté correcto
		}

	}

}
