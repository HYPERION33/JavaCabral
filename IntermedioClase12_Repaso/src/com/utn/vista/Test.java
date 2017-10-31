package com.utn.vista;

import org.omg.CORBA.Principal;

import com.utn.controlador.NadadorControlador;
import com.utn.modelo.Avanzado;
import com.utn.modelo.IEstilo;
import com.utn.modelo.ISalto;
import com.utn.modelo.Intermedio;
import com.utn.modelo.Nadador;
import com.utn.modelo.Persona;
import com.utn.modelo.Principante;

public class Test {

	public static void main(String[] args) {

		NadadorControlador nc = new NadadorControlador();
		
		IEstilo p1 = new Principante();
		nc.nadoEstilo(p1);
		
		IEstilo p2 = new Intermedio();
		nc.nadoEstilo(p2);
		
		//Factoria Abstracta
		IEstilo p3 = new Avanzado();
		nc.nadoEstilo(p3);
		
		nc.nadoEstilo(new IEstilo() {
			
			@Override
			public double pecho(int cantLargo) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double mariposa(int canLargo) {
				// TODO Auto-generated method stub
				return canLargo* 50.0;
			}
			
			@Override
			public double espalda(int cantLargo) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double crol(int cantLargo) {
				// TODO Auto-generated method stub
				return 0;
			}
		});

		
		IEstilo p4 = new Principante() {
			
			@Override
			public double mariposa(int cantLargo) {
				// TODO Auto-generated method stub
				return cantLargo*2.0;
			}
		};
		
		System.out.println("================");
		nc.nadoEstilo(p1);
		nc.nadoEstilo(p4);
		System.out.println("================");
		
		
		
		
		
		
		
		
		
		 IEstilo estilo1 = new Principante() {
			
			@Override
			public double pecho(int cantLargo) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double mariposa(int canLargo) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double espalda(int cantLargo) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double crol(int cantLargo) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		nc.nadoEstilo(estilo1);
		nc.nadoEstilo(estilo1);
		nc.nadoEstilo(estilo1);
		nc.nadoEstilo(estilo1);
		nc.nadoEstilo(estilo1);
		nc.nadoEstilo(estilo1);
		
		
		Persona p5 = new Persona();
		
		Persona p6 = new Persona() { 
			//inicio anonimo
			@Override
			public void saltoALaPiletaAmeo() {
				// TODO Auto-generated method stub
				System.out.println("Salto de palito");
			}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		@Override
			protected void finalize() throws Throwable {
				// TODO Auto-generated method stub
				super.finalize();
			}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
			//fin anonimo
		};
		
		p5.saltoALaPiletaAmeo();
		
		p6.saltoALaPiletaAmeo();
		
		nc.tipoSalto(new ISalto() {
			@Override
			public void estiloSalto() {
				System.out.println("salto de cabeza mientras me hago caca en el aire");
			}
		});
		nc.tipoSalto(new ISalto() {
			@Override
			public void estiloSalto() {
				System.out.println("Salto palito");
			}
		});
		
		Persona p7 = new Persona();
		
		Persona p8 = new Persona();
		
//		p7.setSaltoMistico("Espaldazo");
		p7.setNombre("asdasd");
		p7.setNombre("asdasdasdsad");
		System.out.println(p8.getSaltoMistico());
		
		Nadador n1 = new Principante();
		n1.setNombre("Cacho de america");
		
		nc.nadoEstilo((IEstilo)n1);
		nc.mostrarTodosLosNadadores();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




