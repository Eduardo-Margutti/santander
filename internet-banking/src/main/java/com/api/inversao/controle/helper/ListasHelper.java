package com.api.inversao.controle.helper;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.apache.catalina.authenticator.SpnegoAuthenticator.SpnegoTokenFixer;
import org.apache.catalina.mapper.Mapper;

public class ListasHelper {

	public static void array() { 	
		
		double[] notas = new double[10]; 
		notas[0] = 5.5;
		notas[1] = 6.5;
		notas[2] = 5.9;
		notas[3] = 2.5;
		
		System.out.println(Arrays.toString(notas));
	
		double[] notasBaixas = {1.1, 2.1, 7.5}; 

		System.out.println(Arrays.toString(notasBaixas));

		System.out.println(notas.length + "\n" + notasBaixas.length); 

	}
	
	// COLLECTIONS
	
	// SET (NÃO ACEITA OBJ. DUPLICADO, NÃO É INDEXADO)
	public static void collectionSet() {
		
		Set<String> objOrdenado = new TreeSet<String>();
		objOrdenado.add("Valores");
		objOrdenado.add("Textos");
		objOrdenado.add("Paragrafos");
		objOrdenado.add("validações");
		
		Set<String> objHomogeneo = new HashSet<String>();
		objHomogeneo.add("Valores");
		objHomogeneo.add("Textos");
		

		System.out.println(objHomogeneo.size());
		System.out.println(objHomogeneo);
		
		System.out.println(objOrdenado.size());
		System.out.println(objOrdenado);
		
		for(String objeto : objHomogeneo) {
			System.out.println(objeto);
		}
	}
	
	//QUEUE (FIFO -> FIRST IN FIRST OUT)
	public static void queue() {
		
		Queue<String> fila = new LinkedList<String>();
		fila.add("pedro");
		fila.offer("sandra");
		
		System.out.println("proximo da fila: " + fila.peek());
		System.out.println("proximo da fila: " + fila.element());
		System.out.println("proximo da fila: " + fila.poll());
		System.out.println("proximo da fila: " + fila.element());

	}
	
	//PILHA (Deque - LIFO)
	public static void pilha() {
		
		Deque<String> fila = new ArrayDeque<String>();
		fila.add("pedro");
		fila.push("sandra");
		
		System.out.println("Elemento : " + fila.peek());
		System.out.println("Elemento : " + fila.element());
		System.out.println("Elemento : " + fila.poll());
		System.out.println("Elemento : " + fila.element());

	}
	
	//MAP
	public static void map() {
		
		Map<Integer, String> mapper = new HashMap<Integer, String>();
		mapper.put(1, "Pedro");
		mapper.put(2, "Carlos");
		
		System.out.println("Mapper : " + mapper.get(1));
		System.out.println("Mapper : " + mapper.values());
		System.out.println("Mapper : " + mapper.keySet());
		
		for(Entry<Integer,String> map : mapper.entrySet()) {
			System.out.println("Key : " + mapper.keySet() + " Valor: "+ map.getValue());
		}
		
	}
}
