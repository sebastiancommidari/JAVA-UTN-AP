
public class PuntoC {

	public static void main(String[] args) {

		System.out.println("c.Genere un array de 10 números, y al numero en la posición 6, dividir por 3.:");

		int unoAlDiez[] = new int[10];

		for (int i = 1; i <= 10; i++) {
			unoAlDiez[i - 1] = i;

			if (unoAlDiez[i - 1] == unoAlDiez[6]) {
				unoAlDiez[6] = i / 3;
			}

			System.out.println("Posición["+(i-1)+"]: "+unoAlDiez[i - 1]); // Imprimo para ver que esté correcto
		}

	}
}
