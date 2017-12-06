package com.utn.dao;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utn.modelo.Persona;

public class PersonaFactory {

	//
	public Persona getPersona(int id) {
		Connection conn = null;
		Persona p = new Persona();
		try {
			conn = ConnexMysql.newInstance().getConnection();

			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("select * from persona where id = ?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			
			Class classPersona = Class.forName("com.utn.modelo.Persona");

			Field[] campos=  p.getClass().getDeclaredFields();
			
			Object objPersona = classPersona.newInstance();
			
			//trabajamos con reflection para setear el objeto Persona
			while(rs.next()) {
				for (Field item : campos) {
					Field c =  p.getClass().getDeclaredField(item.getName());
					c.setAccessible(true);
					c.set(p, rs.getObject(item.getName()));	
				}
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			try {
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		return p;

	}

}
