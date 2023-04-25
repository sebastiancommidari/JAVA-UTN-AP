package consultorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//UTILIZO ESTA CLASE PARA CONECTAR A LA BBDD Y CREAR LOS METODOS PARA INTERACTUAR CON LAS MISMA

public class ConexionBD {

	Connection conexion = null;
	Statement sentencia = null;

	// METODO PARA CONECTAR A LA BBDD (CONSULTORIO)

	public void conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorio", "root", "");

			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println("*-*CONEXIÓN REALIZADA CORRECTAMENTE*-*");
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		} catch (Exception e) {

			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println(" * NO SE PUDO ESTABLECER LA CONEXIÓN * ");
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		}

	}

	// METODO PARA DESCONEXION DE LA BBDD

	public void desconectar() {
		try {

			conexion.close();
			System.out.println("\n************************************************************\n");
			System.out.println("La conexion a la base de datos ha finalizado");
			System.out.println("\n************************************************************");

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());
		}

	}

	// -------------------------------------------------------------------------------------------------------------------

	// METODO PARA LISTAR Y CONSULTAR TABLAS PACIENTRS, MEDICOS E HISTORIAS CLINICAS

	public void consultarTablaPacientes() {

		ResultSet r = buscar(
				"select DNIPaciente,NombrePaciente,ApellidoPaciente,CalleDomicilioPaciente,NroDomicilioPaciente from pacientes");
		try {

			System.out.println("\nLISTADO DE PACIENTES DEL CONSULTORIO");
			System.out.println("\n  DNI   | NOMBRE | APELLIDO | CALLE | N°");

			while (r.next()) {

				System.out.println(r.getInt("DNIPaciente") + " | " + r.getString("NombrePaciente") + " | "
						+ r.getString("ApellidoPaciente") + " | " + r.getString("CalleDomicilioPaciente") + " | "
						+ r.getInt("NroDomicilioPaciente"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void consultarTablaMedicos() {

		ResultSet r = buscar("select MatriculaMedico,NombreMedico,ApellidoMedico,EspecialidadMedico from medicos");
		try {

			System.out.println("\nLISTADO DE MÉDICOS DEL CONSULTORIO");
			System.out.println("\nMAT N° | NOMBRE | APELLIDO | ESPECIALIDAD");

			while (r.next()) {

				System.out.println(r.getInt("MatriculaMedico") + " | " + r.getString("NombreMedico") + " | "
						+ r.getString("ApellidoMedico") + " | " + r.getString("EspecialidadMedico"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
	
	public void consultarTablaHC() {

		ResultSet r = buscar(
				"select NumeroHC,FechaHC,DiagnosticoHC,DNIPacHC,MatMedHC from historiaClinica");
		try {

			System.out.println("\nLISTADO DE HISTORIAS CLINICAS");
			System.out.println("\n  N° HC   | FECHA | DIAGNOSTICO | DNI PAC | MAT MED");

			while (r.next()) {

				System.out.println(r.getInt("NumeroHC") + " | " + r.getDate("FechaHC") + " | "
						+ r.getString("DiagnosticoHC") + " | " + r.getInt("DNIPacHC") + " | "
						+ r.getInt("MatMedHC"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
	
	//METODO BUSCAR NECESARIO PARA AMBAS CONSULTAS

	ResultSet buscar(String sql) {
		try {
			sentencia = conexion.createStatement(); //

			return sentencia.executeQuery(sql);

		} catch (SQLException ex) {
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;

	}
	
	//-----------------------------------------------------------------------------------------------------

	//METODOS DE PACIENTES	
		
	/*MÉTODO INGRESAR PACIENTES NUEVOS*/
		
	    public void agregarTablaPacientes() {
	    	String usuario="root";
	        String password="";
	        Scanner ingresar = new Scanner(System.in);//
	        
	        System.out.println("Ingrese el DNI del PACIENTE: ");
	        int DNIPaciente  = ingresar.nextInt(); 
	        
	        System.out.println("Ingrese el NOMBRE del PACIENTE:  ");
	        String NombrePaciente = ingresar.next(); 
	        
	        System.out.println("Ingrese el APELLIDO del PACIENTE:  ");
	        String ApellidoPaciente = ingresar.next(); 
	        
	        System.out.println("Ingrese la CALLE del DOMICILIO del PACIENTE");
	        String CalleDomicilioPaciente = ingresar.next();
	        
	        System.out.println("Ingrese N° de la CALLE del PACIENTE)");
	        int NroDomicilioPaciente  = ingresar.nextInt();
	        
	        String sql = "insert into pacientes (DNIPaciente,NombrePaciente,ApellidoPaciente,CalleDomicilioPaciente,NroDomicilioPaciente) values ('"+DNIPaciente+"','"+NombrePaciente+"','"+ApellidoPaciente+"','"+CalleDomicilioPaciente+"','"+NroDomicilioPaciente+"')";
	        Connection con=null;
	            try{
	        
	       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorio", usuario, password);  
	       Statement sentencia = con.createStatement();    
	                                             
	       int m = sentencia.executeUpdate(sql); 
	         if (m == 1)
	             System.out.println("El PACIENTE("+NombrePaciente+" "+ApellidoPaciente+") fue ingresado satisfactoriamente!");
	         else
	             System.out.println("¡Error! Se produjo una falla en el ingreso!");
	      con.close();
	    }
	    catch(Exception e)
	    {
	       e.printStackTrace();
	    }
	}

	    
	    /*MÉTODO PARA ELIMINAR PACIENTES DE LA BBDD*/
	    
	        public void eliminarRegistroPacientes() {
	        	String usuario="root";
	            String password="";
	            Scanner ingresar = new Scanner(System.in);

	            System.out.println("Escriba el DNI del PACIENTE a eliminar:...");
	            int DNIPaciente  = ingresar.nextInt(); 
	            
	            String sql ="DELETE FROM pacientes WHERE DNIPaciente = '"+DNIPaciente+"'";
	            Connection con=null;
	           
	            try {   
	            	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorio", usuario, password);  
	                Statement sentencia = conexion.createStatement();
	                sentencia.execute(sql);   
	                System.out.println("El registro del PACIENTE se eliminó correctamente!");
	            } catch (Exception e) {  
	              e.printStackTrace();
	              System.out.println("¡Error! Se produjo una falla al borrar registro!");
	            }
	          }
	        
	//-----------------------------------------------------------------------------------------------------
	        
	      //METODOS DE MÉDICOS	

	        /*MÉTODO PARA INGRESAR NUEVOS MEDICOS*/
	        	
	            public void agregarTablaMedicos() {
	            	String usuario="root";
	                String password="";
	                Scanner ingresar = new Scanner(System.in);
	                
	                System.out.println("Ingrese el N° de MATRÍCULA del MÉDICO: ");
	                int MatriculaMedico  = ingresar.nextInt(); 
	                
	                System.out.println("Ingrese el NOMBRE del MÉDICO:  ");
	                String NombreMedico = ingresar.next(); 
	                
	                System.out.println("Ingrese el APELLIDO del MÉDICO:  ");
	                String ApellidoMedico = ingresar.next(); 
	                
	                System.out.println("Ingrese la ESPECIALIDAD del MÉDICO ");
	                String EspecialidadMedico = ingresar.next();
	                
	                
	                String sql = "insert into medicos (MatriculaMedico,NombreMedico,ApellidoMedico,EspecialidadMedico) values ('"+MatriculaMedico+"','"+NombreMedico+"','"+ApellidoMedico+"','"+EspecialidadMedico+"')";
	                Connection con=null;
	                    try{
	                
	               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorio", usuario, password);  
	               Statement sentencia = con.createStatement();    
	                                                     
	               int m = sentencia.executeUpdate(sql); 
	                 if (m == 1)
	                     System.out.println("El MÉDICO("+NombreMedico+" "+ApellidoMedico+") fue ingresado satisfactoriamente!");
	                 else
	                     System.out.println("¡Error! Se produjo una falla en el ingreso!");
	              con.close();
	            }
	            catch(Exception e)
	            {
	               e.printStackTrace();
	            }
	        }

	       
	            
	            /*MÉTODO PARA ELIMINAR MEDICOS DE LA BBDD*/
	            
	                public void eliminarRegistroMedicos() {
	                	String usuario="root";
	                    String password="";
	                    Scanner ingresar = new Scanner(System.in);

	                    System.out.println("Escriba el N° de Matrícula del MÉDICO a eliminar:...");
	                    int MatriculaMedico  = ingresar.nextInt(); 
	                    
	                    String sql ="DELETE FROM medicos WHERE MatriculaMedico = '"+MatriculaMedico+"'";
	                    Connection con=null;
	                   
	                    try {   
	                    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorio", usuario, password);  
	                        Statement sentencia = conexion.createStatement();
	                        sentencia.execute(sql);   
	                        System.out.println("El registro del MÉDICO se eliminó correctamente!");
	                    } catch (Exception e) {  
	                      e.printStackTrace();
	                      System.out.println("¡Error! Se produjo una falla al borrar registro!");
	                    }
	                  }
}
