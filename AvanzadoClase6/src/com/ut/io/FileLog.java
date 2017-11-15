package com.ut.io;

import java.io.File;
import java.io.FileWriter;

public class FileLog extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3810147262503630445L;

	
	private String mensaje;
	
	public FileLog(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void guardoErrorArchivoLog() {
		
		try {
			File flog = new File("log.txt");
			FileWriter fw = new FileWriter(flog,true);
			
			fw.write(mensaje);
			fw.flush(); //save
			fw.close(); //close
			
			
		} catch (Exception e) {
			System.out.println("exploto " + e.getMessage());
		}
		
	}
}
