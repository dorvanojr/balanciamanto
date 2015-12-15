package br.com.main;

import java.util.Stack;


public class BalanCaracteres {

	    public static boolean verificaCaracteres(String palavra) {
	        Stack<Character> caracter = new Stack<Character>();  
	        
	        char parentes1 = '(';
	        char parentes2 = ')';
	        char chaves1 = '{';
	        char chaves2 = '}';
	        char cochetes1 = '[';
	        char cochetes2 = ']';
	        
	        for (int indice = 0; indice < palavra.length(); indice++) { 
	            
	            if (palavra.charAt(indice) == parentes1)
	            	caracter.push(parentes1);
	           
	            else if (palavra.charAt(indice) == chaves1)
	               	 caracter.push(chaves1);
	            
	            else if (palavra.charAt(indice) == cochetes1)
	            	caracter.push(cochetes1);
	            
	            else if (palavra.charAt(indice) == parentes2){
	               
	            	if (caracter.isEmpty())
	                	return false;
	            	
	                if (caracter.pop() != parentes1)
	                	return false;
	            } 
	            
	            else if (palavra.charAt(indice) == chaves2) {
	                if (caracter.isEmpty())
	                    return false;
	                if (caracter.pop() != chaves1)
	                    return false;
	            } 
	           
	            else if (palavra.charAt(indice) == cochetes2) {
	                if (caracter.isEmpty())
	                    return false;
	                if (caracter.pop() != cochetes1)
	                    return false;
	            } 
	        }
	        return caracter.isEmpty();
	    }
	   
}
