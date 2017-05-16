package sueltos;

import java.sql.SQLException;

public class consultasql {

	public static void main(String[] args) {
		
		ConexionAbd acc = new ConexionAbd();
			
		try {
			acc.withdraw(100);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Parece que soy un poco zote");
		} finally {
			System.out.println("-- Fin consulta a BBDD local --");
		}

	}

}

