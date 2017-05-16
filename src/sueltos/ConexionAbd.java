package sueltos;

import java.sql.*;

public class ConexionAbd {
	
	public Connection getConn() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";
		
		try {
			   //Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			}
			catch(ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
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

		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);

		return conn;
	}

	public void withdraw(int amount) throws SQLException {
		getConn();
	}
	
	
}

