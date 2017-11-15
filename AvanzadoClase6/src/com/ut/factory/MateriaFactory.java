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
import com.ut.modelo.Materia;

public class MateriaFactory implements ITransactionDB<Materia> {

	private IConnection connex;

	public MateriaFactory() {
		this.connex = new ConnectionFactory();
	}

	@Override
	public List<Materia> getAll() throws ClassNotFoundException, SQLException {

		List<Materia> lista = new ArrayList<>();
		try {
			
			Statement st = (Statement) connex.getConnection().createStatement();
			ResultSet rs =  st.executeQuery("select * from materias");
			
		
			while(rs.next()) {
				lista.add(new Materia(rs.getInt("id"), rs.getString("nombre")));
			}

		} catch (FileLog e) {
			e.guardoErrorArchivoLog();
		}

		return lista;
	}

	@Override
	public boolean insert(Materia tobject) throws SQLException, ClassNotFoundException {
		
		boolean res = false;
		try {
			String sql = "insert into materias (nombre) values (?)";
			PreparedStatement ps = (PreparedStatement) connex.getConnection().prepareStatement(sql);
			ps.setString(1, tobject.getNombre());
			
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
	public boolean delete(Materia tobject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Materia tobject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Materia tobject, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Materia get(int id) throws SQLException, ClassNotFoundException {
		
		Materia m = null;
		try {
			
			Statement st = (Statement) connex.getConnection().createStatement();
			ResultSet rs =  st.executeQuery("select * from materias where id = " + id);
			
		
			while(rs.next()) {
				 m = new Materia(rs.getInt("id"), rs.getString("nombre"));
			}

		} catch (FileLog e) {
			e.guardoErrorArchivoLog();
		}

		return m;
	}

}
