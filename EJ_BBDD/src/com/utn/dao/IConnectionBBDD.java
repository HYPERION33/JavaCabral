package com.utn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface IConnectionBBDD {
	//obtengo la coneccion a la base de datos en un tipo interfaz.
	//ademas, lanzo las excepciones que se deberan implementar.
	
	public default Connection getConnection() throws SQLException, ClassNotFoundException{
		
		Connection con=null;
		
		try {
		// realizo la conexion:
		//convencionnn
		Class.forName("com.mysql.jdbc.Driver");	
		//casteo de Connection, se utiliza el DriverManager para indicar la ruta.
		con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			if(con == null) {
					System.out.println("Se interrumpio la conexion.");
			}
			
		}catch (Exception e) {
		e.printStackTrace();			
			
		}
		
		return con;
	}
	
}
