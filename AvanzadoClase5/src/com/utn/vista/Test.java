package com.utn.vista;

import com.utn.controller.AliumnoSerializable;
import com.utn.dao.ConnectMysql;

public class Test {

	public static void main(String[] args) {
		AliumnoSerializable as = new AliumnoSerializable();
		
		as.serializoObjeto();
		as.deserializoObj();
		
		ConnectMysql c = new ConnectMysql();
		c.connectToMySql();
		
		
	}

}
