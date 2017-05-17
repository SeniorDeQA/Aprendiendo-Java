package sueltos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionAbd2 {
	
	static String bd = "pruebas";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + bd +"?characterEncoding=utf-8";

	Connection connection = null;

	public ConexionAbd2() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			
		} catch(ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error tipo 1, clase del driver no localizada");
				System.exit(1);
		} catch(SQLException ex){	
			  	System.out.println(ex.getMessage());
				System.out.println("Error tipo 2, sql");
				System.exit(2);
		}

	}
	
	public Connection getConnection() {
		return connection;
	}

	public void desconectar() {
		connection = null;
		System.out.println("Cerrada conexión");
	}

//Clase ConexionAbd2 hace una conexión, y luego hay métodos para coger la coneción o soltarla

}