package com.utn.tutoriales;

import java.sql.*;
public class conecta_BBDD {
	
	public static void main(String[] args) {
		
		try {
			//1. CREAR CONEXION.
			Class.forName("com.mysql.jdbc.Driver");
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			//2. CREAR OBJETO STATEMENT PARA REALIZAR UNA CONSULTA SQL
			Statement miStatement = miConexion.createStatement();
			
			//3. EJECUTAR SENTENCIA SQL.(EXECUTE QUERY)
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM EMPLEADOS");
			
			//4. RECORRER RESULTSET (TABLA VIRTUAL)
			while (miResultSet.next()) {
				
				System.out.println(miResultSet.getInt("ID") + " " + miResultSet.getString("NOMBRE") + " " + miResultSet.getString("APELLIDO") + " "
				+ miResultSet.getInt("EDAD") + " " + miResultSet.getInt("ID_LEGAJO") + " " + miResultSet.getString("CARGO"));
			
				//System.out.println(miResultSet.getString("NOMBRE") + " " + miResultSet.getString("APELLIDO"));
			}
			
			
		}catch(Exception e) {
		System.out.println("ERROR DE CONEXION.");
		e.printStackTrace();			
			
		}
	}

}
