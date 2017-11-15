package com.utn.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.utn.modelo.Alumno;

public class AliumnoSerializable {

	
	public void serializoObjeto() {
		try {
			
			FileOutputStream fileOut = 
			new FileOutputStream("alumno.ser");
			
			
			ObjectOutputStream objSt = 
			new ObjectOutputStream(fileOut);
			Alumno a = new Alumno();
			a.setMateria("java Intermedio");
			a.setNombre("Matias Mon");
			a.setNota(3);

			//guardo la clase en un binario
			objSt.writeObject(a);
			/*
			 * https://www.tutorialspoint.com/java/java_serialization.htm
			 * flush = sirve para guardar el objeto en un
			 * archivo ... 
			 * Si el archivo esta abierto y esta el flush
			 * se puede guardar
			 * sin embargo el archivo esta abierto y no tiene 
			 * el flush no lo guarda una chota
			 */
			objSt.flush();
			objSt.close();
			fileOut.flush();
			fileOut.close();
			
			
		} catch (Exception e) {
			System.out.println("Rompiooo");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void deserializoObj() {
		try {
			FileInputStream fileIn = 
			new FileInputStream("alumno.ser");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			
			Alumno a =  (Alumno)objIn.readObject();
			
			System.out.println(a.getNombre());
			System.out.println(a.getMateria());
			System.out.println(a.getNota());
			
			
//			Dos opciones para validar objetos
//			if(objIn.getClass().getSimpleName().equals("Alumno"))
//			{
//				
//			}
//			
//			if (objIn.readObject() instanceof Alumno) {
//				Alumno item = (Alumno) objIn.readObject();
//				
//			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
}
