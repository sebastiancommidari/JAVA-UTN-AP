package conexion.bd;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", ""); // la
			System.out.println("Conexion exitosa!!");

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador!!!!");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Error en la conexion!!!!");
			e.printStackTrace();
		}
	}
}
