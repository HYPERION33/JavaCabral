package com.utn.tutoriales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class modifica_BBDD {
	
	public static void main(String[] args) {
		
		try {
			//1. CREAR CONEXION.
			Class.forName("com.mysql.jdbc.Driver");
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			//2. CREAR OBJETO STATEMENT PARA REALIZAR UNA CONSULTA SQL
			Statement miStatement = miConexion.createStatement();
			
			//INSERTAR
			String instruccionSQL = "INSERT INTO EMPLEADOS (NOMBRE,APELLIDO,EDAD,ID_LEGAJO,CARGO) VALUES ('Victor','Gonzalez',40,55,'Mantenimiento')";
							
			miStatement.executeUpdate(instruccionSQL);
			
			System.out.println("Operacion exitosa.");
			//ACTUALIZAR
			instruccionSQL = "UPDATE `empleados` SET `NOMBRE` = 'CACHO' WHERE `empleados`.`ID_LEGAJO` = '55'";

			miStatement.executeUpdate(instruccionSQL);
			
			System.out.println("Actualizacion exitosa.");
			//BORRADO
			
			instruccionSQL = "DELETE FROM EMPLEADOS WHERE APELLIDO='GONZALEZ'";
			
			//No te olvides del WHERE en el DELETE FROM, sino borras todo.
			
			miStatement.executeUpdate(instruccionSQL);
			
			System.out.println("Borrado exitoso.");
			
			
		}catch(Exception e) {
		System.out.println("ERROR DE CONEXION.");
		e.printStackTrace();			
			
		}
	}
}
