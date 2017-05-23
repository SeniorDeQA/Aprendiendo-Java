package selenium;

import java.sql.*;

public class Consultasql_DAO {

	public static void main(String[] args) throws SQLException {
		
		DAO.defineConnection("jdbc:mysql://localhost:3306/","root","");
		
		DAO.query("SELECT * FROM pruebas.usuarios;");
		
		DAO.closeConnection();
		


	}

}

