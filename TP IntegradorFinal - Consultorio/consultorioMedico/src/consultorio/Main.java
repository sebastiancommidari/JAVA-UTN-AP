package consultorio;

import java.util.Scanner;

//CLASE PRINCIPAL PARA EJECUTAR EL PROGRAMA

public class Main {
	
	public static void main(String[] args) {
		
		//INSTANCIO LOS OBJETOS NECESARIOS
		
		Scanner ingresar = new Scanner(System.in);
		ConexionBD conex = new ConexionBD();
        Menu m = new Menu();
        
        conex.conectar();    //CONECTO LA BBDD ANTES DE INICIAR EL MENÚ
        boolean salir = false;
        do {
            switch (m.menuPrin()) {
            	case 1:
            		conex.consultarTablaPacientes(); 
            		break;
            	case 2:
            		conex.agregarTablaPacientes(); 
            		break;
            	case 3:
            		conex.eliminarRegistroPacientes(); 
            		break;
            	case 4:
            		conex.consultarTablaMedicos();
            		break;
            	case 5:
            		conex.agregarTablaMedicos();  
            		break;
            	case 6:
            		conex.eliminarRegistroMedicos(); 
            		break;
            	case 7:
            		conex.consultarTablaHC(); 
            		break;
                case 0:
                    System.out.println("\nHasta la próxima! MUCHAS GRACIAS!!!");
                    conex.desconectar();              
                    salir = true;
                    break;
                default:
                    System.out.println("\nLa opción seleccionada no existe (Seleccione un N° entre 0 y 6)");
                    break;
            }
        } while (!salir);

    }
		
	}


