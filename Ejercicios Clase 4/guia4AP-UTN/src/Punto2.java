import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {

		Scanner escribir = new Scanner(System.in);

		System.out.println("Ingrese su nombre: ");
		String nombre = escribir.next();

		System.out.println("Ingrese su apellido: ");
		String apellido = escribir.next();

		System.out.println("Ingrese su edad: ");
		int edad = escribir.nextInt();

		System.out.println("Su nombre es " + nombre + " " + apellido + " y su edad es " + edad + " años.");

		if (edad >= 18) {
			System.out.println("El sujeto es mayor de edad.");
		} else {
			System.out.println("El sujeto es menor de edad.");
		}

	}

}
