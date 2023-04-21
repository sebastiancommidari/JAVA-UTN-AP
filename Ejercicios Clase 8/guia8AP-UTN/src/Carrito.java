import java.util.InputMismatchException;
import java.util.Scanner;

public class Carrito {

	public static void main(String[] args) {

		Scanner ingresar = new Scanner(System.in);

		// Creo e inicializo variables a utilizar

		String ProdNombre1 = null;
		int ProdCantidad1 = 0;
		double ProdPrecio1 = 0;
		
		int continuar2 = 0;
		String ProdNombre2 = null;
		int ProdCantidad2 = 0;
		double ProdPrecio2 = 0;

		int continuar3 = 0;
		String ProdNombre3 = null;
		int ProdCantidad3 = 0;
		double ProdPrecio3 = 0;

		boolean continua;
		double importeTotal = 0;
		double totalConDescuento = 0;

		// Comienzo el programa

		System.out.println("¡BIENVENIDO! Ingrese un producto a su carrito...");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println();

		// Producto 1 con sus objetos Item y Descuento instanciados

		
		do {
			try {
				continua=false;
				System.out.println("Ingrese el nombre del producto: ");
				ProdNombre1 = ingresar.next();
				if(ProdNombre1.matches("[0-9]+")) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("ERROR! Debe ingresar solo letras. Intentelo nuevamente...");
				continua=true;
			} 
		} while (continua);
		
		
		do {
			try {
				continua=false;
				System.out.println("Ingrese la cantidad: ");
				ProdCantidad1 = ingresar.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR! Debe ingresar un numero entero. Intentelo nuevamente...");
				ingresar.next();
				continua=true;
			} 
		} while (continua);
		
		
		do {
			try {
				continua=false;
				System.out.println("Ingrese el precio: ");
				ProdPrecio1 = ingresar.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("ERROR! Debe ingresar un numero entero. Intentelo nuevamente...");
				ingresar.next();
				continua=true;
			} 
		} while (continua);


		Producto producto1 = new Producto(ProdNombre1, ProdCantidad1, ProdPrecio1);

		ItemCarrito itemC1 = new ItemCarrito(producto1.ProdNombre, producto1.ProdCantidad, producto1.ProdPrecio,
				producto1.ProdCantidad * producto1.ProdPrecio);
		System.out.println("Precio parcial sin descuento: $" + itemC1.ItemCPrecTotal);

		importeTotal += itemC1.ItemCPrecTotal;

		System.out.println();

		Descuento compraDesc1 = new Descuento(itemC1.ProdNombre, itemC1.ProdCantidad, itemC1.ProdPrecio,
				itemC1.ItemCPrecTotal, itemC1.ItemCPrecTotal - (itemC1.ItemCPrecTotal * 0.10));

		totalConDescuento += compraDesc1.DescuentoDesc;

		// PREGUNTO PARA AGREGAR UN SEGUNDO PRODUCTO

		System.out.println("¿Desea agregar otro producto? (1= SI / 2 = NO)");
		continuar2 = ingresar.nextInt();
		if (continuar2 == 1) {
			System.out.println();

			// Producto 2 con sus objetos Item y Descuento instanciados

			do {
				try {
					continua=false;
					System.out.println("Ingrese el nombre del producto: ");
					ProdNombre2 = ingresar.next();
					if(ProdNombre2.matches("[0-9]+")) {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("ERROR! Debe ingresar solo letras. Intentelo nuevamente...");
					continua=true;
				} 
			} while (continua);
			

			do {
				try {
					continua=false;
					System.out.println("Ingrese la cantidad: ");
					ProdCantidad2 = ingresar.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("ERROR! Debe ingresar un numero entero. Intentelo nuevamente...");
					ingresar.next();
					continua=true;
					
				} 
			} while (continua);
			

			do {
				try {
					continua=false;
					System.out.println("Ingrese el precio: ");
					ProdPrecio2 = ingresar.nextDouble();
				} catch (InputMismatchException e) {
					System.out.println("Debe ingresar un numero entero");
					ingresar.next();
					continua=true;
				} 
			} while (continua);

			Producto producto2 = new Producto(ProdNombre2, ProdCantidad2, ProdPrecio2);

			ItemCarrito itemC2 = new ItemCarrito(producto2.ProdNombre, producto2.ProdCantidad, producto2.ProdPrecio,
					producto2.ProdCantidad * producto2.ProdPrecio);
			System.out.println("Precio parcial sin descuento: $" + itemC2.ItemCPrecTotal);

			System.out.println();

			importeTotal += itemC2.ItemCPrecTotal;

			Descuento compraDesc2 = new Descuento(itemC2.ProdNombre, itemC2.ProdCantidad, itemC2.ProdPrecio,
					itemC2.ItemCPrecTotal, itemC2.ItemCPrecTotal - (itemC2.ItemCPrecTotal * 0.10));

			totalConDescuento += compraDesc2.DescuentoDesc;

			// PREGUNTO PARA AGREGAR EL TERCER Y ULTIMO PRODUCTO

			System.out.println("¿Desea agregar un último producto? (1= SI / 2 = NO)");
			continuar3 = ingresar.nextInt();
			if (continuar3 == 1) {
				System.out.println();

				// Producto 3 con sus objetos Item y Descuento instanciados

				do {
					try {
						continua=false;
						System.out.println("Ingrese el nombre del producto: ");
						ProdNombre3 = ingresar.next();
						if(ProdNombre3.matches("[0-9]+")) {
							throw new Exception();
						}
					} catch (Exception e) {
						System.out.println("ERROR! Debe ingresar solo letras. Intentelo nuevamente...");
						continua=true;
					} 
				} while (continua);

				do {
					try {
						continua=false;
						System.out.println("Ingrese la cantidad: ");
						ProdCantidad3 = ingresar.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("ERROR! Debe ingresar un numero entero. Intentelo nuevamente...");
						ingresar.next();
						continua=true;
					} 
				} while (continua);

				do {
					try {
						continua=false;
						System.out.println("Ingrese el precio: ");
						ProdPrecio3 = ingresar.nextDouble();
					} catch (InputMismatchException e) {
						System.out.println("ERROR! Debe ingresar un numero entero. Intentelo nuevamente...");
						ingresar.next();
						continua=true;
					} 
				} while (continua);

				Producto producto3 = new Producto(ProdNombre3, ProdCantidad3, ProdPrecio3);

				ItemCarrito itemC3 = new ItemCarrito(producto3.ProdNombre, producto3.ProdCantidad, producto3.ProdPrecio,
						producto3.ProdCantidad * producto3.ProdPrecio);
				System.out.println("Precio parcial sin descuento: $" + itemC3.ItemCPrecTotal);

				importeTotal += itemC3.ItemCPrecTotal;

				Descuento compraDesc3 = new Descuento(itemC3.ProdNombre, itemC3.ProdCantidad, itemC3.ProdPrecio,
						itemC3.ItemCPrecTotal, itemC3.ItemCPrecTotal - (itemC3.ItemCPrecTotal * 0.10));

				totalConDescuento += compraDesc3.DescuentoDesc;

				System.out.println("**********************");
			}
		}

		System.out.println("Detalle parcial: ");
		System.out.println();
		System.out.println(ProdNombre1 + " x " + ProdCantidad1 + "u. " + "= $" + ProdCantidad1 * ProdPrecio1);

		if (continuar2 == 1) {
			System.out.println(ProdNombre2 + " x " + ProdCantidad2 + "u. " + "= $" + ProdCantidad2 * ProdPrecio2);
		}

		if (continuar3 == 1) {
			System.out.println(ProdNombre3 + " x " + ProdCantidad3 + "u. " + "= $" + ProdCantidad3 * ProdPrecio3);
		}

		System.out.println();

		if (importeTotal > 1000) {
			System.out.println("Recibe un descuento del 10% por $" + importeTotal * 0.10);
			System.out.println("El total a abonar es $" + totalConDescuento);
		} else {
			System.out.println("*No recibe descuento ya que no supera los $1000*");
			System.out.println();
			System.out.println("El total a abonar es $" + importeTotal);
		}

	}
}
