package sueltos;

import java.sql.*;

public class Consultasql {

	public static void main(String[] args) {
		
		ConexionAbd2 con = new ConexionAbd2();
			
		try {
			
			String sql = "SELECT * FROM usuarios;"; 
			PreparedStatement pst = con.getConnection().prepareStatement(sql);
			
			
			ResultSet rs = pst.executeQuery(sql);

			while(rs.next() ){
				System.out.println (rs.getString ("nombre") + " " + rs.getString ("ape1") + " " + rs.getString("ape2"));
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Parece que soy un poco zote");
		} finally {
			System.out.println("-- Fin consulta a BBDD local --");
		}

	}

}

