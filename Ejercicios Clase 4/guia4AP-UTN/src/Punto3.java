import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {

		Scanner ingresar = new Scanner(System.in);
		
		double precio;
		int cantidad;
		double totalCompra;
		

		System.out.println("Nombre y apellido del cliente:");
		String cliente = ingresar.next();

		System.out.println("Nombre del producto:");
		String producto = ingresar.next();

		System.out.println("Precio del producto($):");
		precio = ingresar.nextDouble();

		System.out.println("Ingrese la cantidad(u):");
		cantidad = ingresar.nextInt();

		totalCompra = precio * cantidad;

		System.out.println("El total de la compra es $" + totalCompra);

		if (totalCompra > 1000) {
			System.out.println("***Obtiene un descuento del 20% por $" + totalCompra * 0.20+"***");
			totalCompra -= totalCompra * 0.20;
			System.out.println("El monto final a abonar es $" + totalCompra);
		} else {
			System.out.println("-No posee descuentos-");
		}
	}

}
