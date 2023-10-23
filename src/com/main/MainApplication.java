package com.main;

import com.bean.Academy;
import com.bean.Corso;

public class MainApplication {

	public static void main(String[] args) {
		
		/*
		 * Una delle due modalità utili
		 * ad inizializzare un array
		 */
		
		int arrayInt [] = new int [3];       //arrayInt è solo un nome dato all'array, il compilatore lo riconosce grazie alle [],
											// funge da telecomando
		
		//valorizzo array
		arrayInt[0]= 89;
		arrayInt[1]= 22;
		arrayInt[2]= 89;
		
		for(int i= 0; i< arrayInt.length; i++) {
			
			System.out.println("Contenuto array int" + arrayInt[i]);
		}
		
		/*
		 * seconda modalità utile per inizializzare un array
		 * 
		 */
		int arrayNew [] = {98,76,57};
		
		for(int i= 0; i< arrayNew.length; i++) {
			
			System.out.println("Contenuto arrayNew" + arrayNew[i]);
	}
		
		/*
		 * ARRAY DI REFERENCE AD OGGETTI
		 */
		
		Corso corsi [] = new Corso[3];
		corsi[0]= new Corso("1234e","JavaSE","Roma");
		corsi[1]= new Corso("5678y","Laravel","Torino");
		corsi[2]= new Corso("2370r","Spring","Milano");
		
		for (Corso corso : corsi) {
			
			System.out.println(corso.toString());
			
		}
		
		Object arrayCA [] = new Object[2];
		
		arrayCA[0] = new Corso("1043r","Angular","Roma");
		arrayCA[1] = new Academy("443e","JAVAEE","Formatemp","Padova");
		
		for (Object object : arrayCA) {
			System.out.println(object.toString());
		}
		
}
	
}
