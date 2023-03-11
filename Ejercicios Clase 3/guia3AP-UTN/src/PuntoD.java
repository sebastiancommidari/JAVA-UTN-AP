
public class PuntoD {
	
	public static void main(String[] args) {
		
		System.out.println("d.Genere un array, mostrando n productos de una tienda deportiva con sus respectivos precios:");

		
		String productos[] = {"Camiseta", "Botines", "Medias", "Pelota"};
		double precios[]= {25000,40000,5500,58000};
		
		for (int i=0; i < productos.length; i++) {
			System.out.println(productos[i]+" = $"+precios[i]);
		}
		
	}

}
