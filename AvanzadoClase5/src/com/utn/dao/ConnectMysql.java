package com.utn.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

public class ConnectMysql {

	
	public void connectToMySql() {
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Connection  conn = (Connection) 
			DriverManager.getConnection("jdbc:mysql://localhost/utnavanzado","root","");
			
			
			//meto el alumno en la base de dato, con un generico e slo optimo
			PreparedStatement ps = conn.prepareStatement("insert into alumnos (nombre,materia,nota) values (?,?,?)");
			ps.setString(1, "Rosana");
			ps.setString(2, "java intermedio");
			ps.setInt(3, 7);
			
			ps.executeUpdate(); 
				System.out.println("Inserto bien");

		} catch (Exception e) {
			System.out.println("No se inserto");
			e.printStackTrace();
		}
		
	}
}
