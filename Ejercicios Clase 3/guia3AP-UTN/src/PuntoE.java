
public class PuntoE {
	
	public static void main(String[] args) {
		
		System.out.println("d.Genere un array con 3 cursos y luego mostrar el promedio de notas de tres cursos:");

		String materias[] = {"Matemática", "Historia", "Geografia"};
		double notas[]= {7.50,10,9};
		
		double suma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		
		double promedio = suma / notas.length;
		
		for (int i=0; i < materias.length; i++) {
			System.out.println(materias[i]+" : "+notas[i]);
		}
		
		System.out.println("El promedio de nota entre las 3 materias es: "+promedio);
		
		
		
		
		
		
		
		
		
	}

}
