package com.ut.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.ut.io.FileLog;

public interface IConnection {

	public default Connection getConnection() throws FileLog, SQLException, ClassNotFoundException {
		Connection conn = null;
		try {
			// por convencionnnn se pone
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/utnavanzado", "root", "");

			if (conn == null)
				throw new FileLog("No se puede conectar a la base de datos");

		} catch (FileLog e) {

			System.out.println(e.getMessage());
		}

		return conn;
	}

}
