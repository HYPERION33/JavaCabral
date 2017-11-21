package com.ut.factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.ut.dao.IConnection;
import com.ut.dao.ITransactionDB;
import com.ut.io.FileLog;
import com.ut.modelo.Alumno;
import com.ut.modelo.Materia;

public class AlumnoFactory implements ITransactionDB<Alumno> {
	
	//por cada tabla una factoria, las factorias vana a implementar las interfaces de DAO

	private IConnection connex;

	public AlumnoFactory() {
		this.connex = new ConnectionFactory();
	}

	@Override
	public List<Alumno> getAll() throws ClassNotFoundException, SQLException {

		List<Alumno> lista = new ArrayList<>();
		try {
			
			Statement st = (Statement) connex.getConnection().createStatement();
			ResultSet rs =  st.executeQuery("select * from alumnos");
			
		
			while(rs.next()) {
				lista.add(new Alumno(rs.getInt("id"), rs.getInt("id_materia"), rs.getString("nombre"),rs.getInt("nota")));
			}

		} catch (FileLog e) {
			e.guardoErrorArchivoLog();
		}

		return lista;
	}

	@Override
	public boolean insert(Alumno tobject) throws SQLException, ClassNotFoundException {
		
		boolean res = false;
		try {
			String sql = "insert into alumnos (id_materias,nombre,nota) values (?,?,?)";
			PreparedStatement ps = (PreparedStatement) connex.getConnection().prepareStatement(sql);
			ps.setInt(2, tobject.getId_materia());
			ps.setString(3, tobject.getNombre());
			ps.setInt(4, tobject.getNota());
			
			res = ps.execute();
			
		} catch (FileLog e) {
			e.guardoErrorArchivoLog();
		}
		return res;
	}

	@Override
	public boolean delete(int id) throws SQLException, ClassNotFoundException {
		boolean res = false;
		try {
			Statement ps = (Statement) connex.getConnection().createStatement();

			res = ps.execute("delete from materias where id=" + id);
			
		} catch (FileLog e) {
			e.guardoErrorArchivoLog();
		}
		return res;
	}

	@Override
	public boolean delete(Alumno tobject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Alumno tobject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Alumno tobject, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Alumno get(int id) throws SQLException, ClassNotFoundException {
		
		Alumno a = null;
		try {
			
			Statement st = (Statement) connex.getConnection().createStatement();
			ResultSet rs =  st.executeQuery("select * from materias where id = " + id);
			
		
			while(rs.next()) {
				 a = new Alumno(rs.getInt("id"), rs.getInt("id_materia"), rs.getString("nombre"), rs.getInt("nota"));
			}

		} catch (FileLog e) {
			e.guardoErrorArchivoLog();
		}

		return a;
	}

}
