package com.utn.cotroller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.utn.modelo.Autito;

public class Autito_Serializable {
	
	public void serializoObjeto(Autito a){//guardo
				
		try {
			//indicamos de que tipo es el archivo que vamos a trascender
			FileOutputStream fileOut=new FileOutputStream("autito.reinita");
			
			ObjectOutputStream objSt=new ObjectOutputStream(fileOut);
						
			//guardo la instancia en binaro...
			objSt.writeObject(a);
			//guardo la instancia en un archivo...
			objSt.flush();
			//cerrar el flush del archivo, sino no guarda cambios...
			objSt.close();
			fileOut.flush();
			fileOut.close();
					
		}catch(Exception e) {
		e.printStackTrace();	
			
		}
	}
	
	public void desserializoObjeto(Autito a) {
		
		try {
			//indicamos de que tipo es el archivo que vamos a leer
			FileInputStream fileIn=new FileInputStream("autito.reinita");
			
			ObjectInputStream objIn=new ObjectInputStream(fileIn);
			
			a = (Autito)objIn.readObject();//casting de Autito a ObjectInputStream
			
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
			
			System.out.println(a.getColor());
			System.out.println(a.getMarca());
			System.out.println(a.getCv());

			objIn.close();
		}catch(Exception e) {
		e.printStackTrace();	
			
		}
	}

}
