import java.util.Scanner;

/* 
  1. Implemente usted mismo para un “carrito de compras”: una clase Producto (que pueda 
tener hasta 3 items), otra ItemCarrito, otra Carrito y otra Descuento. 

2. En un programa main, pida ingresar los datos y arme los objetos correspondientes y con el 
método de carrito “precio”, retorne el resultado. 

Por ejemplo: 
cant precioUnitario producto 
1 40 jabón en polvo 
3 10 esponjas 
2 100 chocolates 

carrito.precio() == 270 

3. Suba el proyecto / ejercicios a Github 
  
 */

public class Main {
	
	public static void main(String[] args) {

		Scanner ingresar = new Scanner(System.in);

		// Comienzo el programa

		System.out.println("¡BIENVENIDO! Ingrese un producto a su carrito...");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println();
		
		//INGRESA PRIMER PRODUCTO

		System.out.println("Ingrese el nombre del primer producto: ");
		String nombre = ingresar.next();

		System.out.println("Ingrese la cantidad: ");
		int cant = ingresar.nextInt();

		System.out.println("Ingrese el precio: ");
		double precioUnitario = ingresar.nextDouble();

		Producto producto1 = new Producto(nombre, precioUnitario);
		ItemCarrito item1 = new ItemCarrito(producto1, cant);
		System.out.println();

		double subtotalItem1 = precioUnitario * cant;

		// AGREGAR UN SEGUNDO PRODUCTO

		System.out.println("Ingrese el nombre del segundo producto: ");
		String nombre2 = ingresar.next();

		System.out.println("Ingrese la cantidad: ");
		int cant2 = ingresar.nextInt();

		System.out.println("Ingrese el precio: ");
		double precioUnitario2 = ingresar.nextDouble();

		Producto producto2 = new Producto(nombre2, precioUnitario2);
		ItemCarrito item2 = new ItemCarrito(producto2, cant2);

		double subtotalItem2 = precioUnitario2 * cant2;

		System.out.println();

		// AGREGAR EL TERCER Y ULTIMO PRODUCTO

		System.out.println("Ingrese el nombre del tercer producto: ");
		String nombre3 = ingresar.next();

		System.out.println("Ingrese la cantidad: ");
		int cant3 = ingresar.nextInt();

		System.out.println("Ingrese el precio: ");
		double precioUnitario3 = ingresar.nextDouble();

		Producto producto3 = new Producto(nombre3, precioUnitario3);
		ItemCarrito item3 = new ItemCarrito(producto3, cant3);

		double subtotalItem3 = precioUnitario3 * cant3;

		System.out.println("**********************");
		
		//EJECUTO EL METODO carrito.precio() como solicitaba la consigna

		Carrito carrito = new Carrito();

		System.out.println("El total del carrito de compras es de $"
				+ carrito.precio(subtotalItem1, subtotalItem2, subtotalItem3));	

	}

}
