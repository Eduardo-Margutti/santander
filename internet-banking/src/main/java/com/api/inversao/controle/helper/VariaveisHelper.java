package com.api.inversao.controle.helper;

public class VariaveisHelper {

	 //STRING
	
	public static String replace(String text, String oldChar, String newChar) { 	
		return text.replace(oldChar, newChar);
	}
	
	public static String toUpperCase(String text){
		return text.toUpperCase();
	}
	
	public static String toLowerCase(String text){
		return text.toLowerCase();
	}
	
	public static String toConcat(String firstText, String secondText){
		return firstText.concat(secondText);
	}
	
	public static char getCharByPosition(String text, int charPosition){
		return text.charAt(charPosition);
	}
	
	
}
