package com.utn.controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

public class ListaController {

	// https://www.ntu.edu.sg/home/ehchua/programming/java/J5c_Collection.html#zz-2.6
	public void lista() {
		List lista = null;
		lista = new ArrayList<>();// mas usada
		lista = new Vector<>();
		lista = new LinkedList<>();// mas usada

		Set listaSet = null;
		listaSet = new HashSet<>(); // mas usada
		listaSet = new TreeSet<>(); // mas usada
		listaSet = new LinkedHashSet<>();
		
		Map<String, String> mapa = null;
		mapa = new HashMap<>(); // mas usada
		mapa = new WeakHashMap<>();
		mapa = new LinkedHashMap<>();
		
	}
}
