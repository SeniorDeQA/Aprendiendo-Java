package selenium;

import java.sql.*;

public class DAO {
	static Connection conn = null;
	
	
	//Definimos una conn, escuchando 3 tipos de excepciones
	static void defineConnection(String cadenaConexion, String usuario, String clave) throws SQLException {
		String url = cadenaConexion; //"jdbc:mysql://localhost:3306/";
		String user = usuario;
		String password = clave;
		
		
		try {
			   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			}
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			}
			catch(IllegalAccessException ex) {
			   System.out.println("Error: access problem while loading!");
			   System.exit(2);
			}
			catch(InstantiationException ex) {
			   System.out.println("Error: unable to instantiate driver!");
			   System.exit(3);
			}

		
		conn = DriverManager.getConnection(url, user, password);
		
	}

	static Connection getConnection() {
		return conn;
	}

	static void closeConnection() {
		conn = null;
		System.out.println("Cerrada conexión");
	}
	
	
	//Le pasamos un string sql a la clase, y la ejecuta
	static void query(String query){
		
		
		try {
			
			String sql = query; 
			PreparedStatement pst = DAO.getConnection().prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery(sql);

			while(rs.next() ){
				System.out.println (rs.getString ("Id") + " " + rs.getString ("Fecha") + " " + rs.getString("Resultado"));
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("-- Fin consulta a BBDD --");
		}

	}
		
	static void insert(String query){
		try {
			
			String sql = query; 
			PreparedStatement pst = DAO.getConnection().prepareStatement(sql);
			
			pst.executeUpdate(sql);

			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}

