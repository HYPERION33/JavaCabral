package com.utn.factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.utn.dao.IConnectionBBDD;
import com.utn.dao.ITransactionBBDD;
import com.utn.modelo.Empleado;

public class EmpleadoFactory implements ITransactionBBDD<Empleado>{
	
	private IConnectionBBDD conex;
	
	//constructor que implementa IconecctionBBDD a atraves de ConectionFactory
	public EmpleadoFactory() {
		
		this.conex=new ConnectionFactory();
	}

	@Override
	public Empleado getElemento(int id) throws SQLException, ClassNotFoundException {

		Empleado e1 = null;
		try {
			Statement st = (Statement) conex.getConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM empleados WHERE ID" + id);
			
			while(rs.next()) {
				
				e1=(new Empleado(rs.getString("NOMBRE"),rs.getString("APELLIDO"),rs.getInt("EDAD"),rs.getInt("ID_LEGAJO"),rs.getString("CARGO")));
			}		
			
		}catch(SQLException e) {
		e.printStackTrace();	
			
		}catch(ClassNotFoundException e) {
		e.printStackTrace();	
			
		}catch(Exception e) {
		e.printStackTrace();	
			
		}
		
		return e1;
	}

	@Override
	public List<Empleado> getAll() throws SQLException, ClassNotFoundException {
		
		List<Empleado> lista=new ArrayList<>();
		
		try {
			
			Statement st = (Statement) conex.getConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM empleados");
			
			while(rs.next()) {
				
				lista.add(new Empleado(rs.getString("NOMBRE"),rs.getString("APELLIDO"),rs.getInt("EDAD"),rs.getInt("ID_LEGAJO"),rs.getString("CARGO")));
			}		
		}catch(SQLException e) {
		e.printStackTrace();	
			
		}catch(ClassNotFoundException e) {
		e.printStackTrace();	
			
		}catch(Exception e) {
		e.printStackTrace();	
			
		}
		
		return lista;
	}

	@Override
	public boolean insert(Empleado tobject) throws SQLException, ClassNotFoundException {
	//agrega un elemento del tipo T a la BBDD. En esta caso, Empleados.
		
		boolean orden=false;
		
		try {			
		String sql = "insert into empleados (NOMBRE,APELLIDO,EDAD,ID_LEGAJO,CARGO) values (?,?,?,?,?)";
		PreparedStatement ps = (PreparedStatement) conex.getConnection().prepareStatement(sql);
		ps.setString(1, tobject.getNombre());
		ps.setString(2, tobject.getApellido());
		ps.setInt(3, tobject.getEdad());
		ps.setInt(4, tobject.getId_legajo());
		ps.setString(5, tobject.getCargo());
		
		orden=ps.execute();	
		
		}catch(SQLException e) {
		e.printStackTrace();	
			
		}catch(ClassNotFoundException e) {
		e.printStackTrace();
			
		}catch(Exception e) {
		e.printStackTrace();	
			
		}
		
		return orden;
	}

	@Override
	public boolean delete(int id) throws SQLException, ClassNotFoundException {
	//elimina un elemento en la BBDD ingresando el Id del mismo.	
		boolean orden=false;
		
		try {
			Statement ps = (Statement) conex.getConnection().createStatement();
			orden = ps.execute("delete from empleados where id=" + id);
						
		}catch(SQLException e) {
		e.printStackTrace();	
			
		}catch(ClassNotFoundException e) {
		e.printStackTrace();	
			
		}catch(Exception e) {
		e.printStackTrace();	
			
		}
		
		return orden;
	}

	@Override
	public boolean delete(Empleado tobject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Empleado tobject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Empleado tobject, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
