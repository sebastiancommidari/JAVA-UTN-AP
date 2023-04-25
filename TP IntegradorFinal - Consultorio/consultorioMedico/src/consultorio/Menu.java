package consultorio;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

//UTILIZO ESTA CLASE PARA EL OBJETO MENU

public class Menu {
	
	Connection conexion = null;
    Statement sentencia = null;
	
	public int menuPrin() {

        Scanner ingresar = new Scanner(System.in);

        System.out.println("\n-----------------------------------");
        System.out.println(" BBDD Consultorio Médico - MySQL");
        System.out.println("-----------------------------------");
        System.out.println("\n ¡Bienvenido! Elija una opción...");
        System.out.println("\n-----------------------------------");
        System.out.println("");
        System.out.println("1.Ver la lista de PACIENTES");        
        System.out.println("2.Ingresar un nuevo PACIENTE");
        System.out.println("3.Eliminar un PACIENTE del sistema");
        System.out.println("");
        System.out.println("4.Ver la lista de MÉDICOS");        
        System.out.println("5.Ingresar un nuevo MÉDICO");
        System.out.println("6.Eliminar un MÉDICO del sistema");
        System.out.println("");
        System.out.println("7.Ver lista de HISTORIAS CLINICAS");
        System.out.println("");
        System.out.println("0.SALIR");


        return ingresar.nextInt();

    }	


}
