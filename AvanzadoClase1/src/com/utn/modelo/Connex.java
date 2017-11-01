package com.utn.modelo;

public class Connex implements IConnections<MySql> {

	@Override
	public MySql connectDB() {
		// TODO Auto-generated method stub
		return new MySql();
	}


	

}
