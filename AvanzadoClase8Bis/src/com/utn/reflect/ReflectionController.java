package com.utn.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.utn.modelo.Persona;

public class ReflectionController {

	public void noReflect() {

		Persona p = new Persona();
		p.setNombre("Nahuel");

		System.out.println(p.getNombre());

	}

	public void reflect() {

		try {
			// Recuperamos la clase
			Class classPersona = Class.forName("com.utn.modelo.Persona");

			// creamos la instancia del objeto Persona
			Object objPersona = classPersona.newInstance();

			// dentro del vector de clases se pasan los parametros que espera el metodo
			Class[] param = { String.class };

			// se crea una variable de tipo Method donde contiene el metodo de la clase
			// Persona llamado setNombre
			Method setNombre = classPersona.getDeclaredMethod("setNombre", param);

			// se crea un vector de objetos donde va a contener el/los valores que espera el
			// metodo
			Object[] value = { "Juancito" };

			// se ejecuta el metodo setNombre con instancia y los valores
			setNombre.invoke(objPersona, value);

			// nos creamos un vector de clases que no contenga parametros
			Class[] noParam = {};

			// nos creamos un vecto de object vacio
			Object[] noObjectArgument = {};

			// creamos una variable de tipo method donde contiene el metodo getNombre
			Method getNombre = classPersona.getDeclaredMethod("getNombre", noParam);

			// ejecutamos el metodo y obtenermos el valor
			Object nombre = getNombre.invoke(objPersona, noObjectArgument);

			System.out.println(nombre);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void allMethodPersona() {

		// objeto clase persona
		Class classPersona = null;
		try {

			classPersona = Class.forName("com.utn.modelo.Persona");

			// creo una instancia de la clase perosna x reflection
			Object objPersona = classPersona.newInstance();

			// obtengo todos los metodos de la clase Persona
			Method[] allMethods = classPersona.getMethods();

			for (Method item : allMethods) {

				System.out.println("METODO: " + item.getName());
				// parameters hacer referencia a los parametros del metodo
				// ejemplo setNombre( parametro key : nombre = value: "Pepe" )
				Parameter[] params = item.getParameters();

				System.out.println("PARAMETROS: ");

				for (Parameter itemParam : params) {
					System.out.println("param: " + itemParam.getName());
					System.out.println("Type: " + itemParam.getType());

				}
				System.out.println("Return: " + item.getReturnType());
				System.out.println("=====================");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void allField() {
		// objeto clase persona
		Class classPersona = null;

		try {
			classPersona = Class.forName("com.utn.modelo.Persona");

			// creo una instancia de la clase perosna x reflection
			Object objPersona = classPersona.newInstance();

			
			Field[] campos = classPersona.getDeclaredFields();
			System.out.println("===========TRABAJAMOS CON LOS ARGUMENTOS ============");
			
			for (Field item : campos) {
				
				item.setAccessible(true);
				System.out.println("Name: " + item.getName());
				System.out.println("Type: " + item.getType());
				if("nombre".equals(item.getName())) {
					item.set(objPersona, "Gargamel!!!");
					System.out.println(item.get(objPersona));
				}
				System.out.println("=============");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} catch (NoSuchFieldException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
