package com.ut.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

public interface ITransactionDB<T> {

	


	public T get(int id) throws SQLException, ClassNotFoundException;

	public List<T> getAll() throws ClassNotFoundException, SQLException;

	public boolean insert(T tobject) throws SQLException, ClassNotFoundException;

	public boolean delete(int id) throws SQLException, ClassNotFoundException;

	public boolean delete(T tobject);

	public boolean update(T tobject);

	public boolean update(T tobject, int id);

}
