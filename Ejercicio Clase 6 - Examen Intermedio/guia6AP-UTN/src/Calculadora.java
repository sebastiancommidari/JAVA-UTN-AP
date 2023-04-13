import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		double unNumero =0;
		double otroNumero=0;
		int opcion=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número:");
		unNumero = teclado.nextDouble();
		System.out.println("Ingrese el segundo número:");
		otroNumero = teclado.nextDouble();
		
		System.out.println("Seleccione el número de operación a ejecutar (1=SUMA, 2=RESTA, 3=MULTIPLICACIÓN, 4=DIVISIÓN):");
		opcion=teclado.nextInt();
		
		Operaciones operacion = new Operaciones(unNumero, otroNumero);
		double resultado=0;
		
		switch (opcion) {
		case 1: resultado = operacion.sumar();
		break;
		case 2: resultado=operacion.restar();
		break;
		case 3: resultado= operacion.multiplicar();
		break;
		case 4: resultado= operacion.dividir();
		break;
		default: System.out.println("***Opción inválida***");
		}
		System.out.println("El resultado de la operación es: "+resultado);
	}

}
