package com.utn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface ITransactionBBDD<T>{
	
	/*Interfaz que implementara todos los metodos correspondientes a
	 * el intercambio de infomrmacion entre la BBDD y el codigo fuente
	 */
	
	//Obtiene un elemento de tipo T indicando el indice en la BBDD
	public T getElemento(int id)throws SQLException, ClassNotFoundException;

	//Obtiene todos los elementos y los almacena en una List
	public List<T> getAll()throws SQLException, ClassNotFoundException;
	
	//Utilizo un boolean para las demas acciones
	
	public boolean insert(T tobject) throws SQLException, ClassNotFoundException;

	public boolean delete(int id) throws SQLException, ClassNotFoundException;

	public boolean delete(T tobject);

	public boolean update(T tobject);

	public boolean update(T tobject, int id);
	
	

}
