package com.generation;

import java.util.Scanner;//Se debe importar el scaner

public class Codigo4 {
	
	static void main (String[] args) {
		
Scanner s = new Scanner(System.in);//Le faltaban argumentos al teclado
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);//Le faltaban argumentos al teclado
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {//LE sobraba un paréntesis 
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }
	          

	        case "papel":
	          if (j2 == "piedra") {
	            g = 2;
	          }
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 3;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	      
	    }

}
		
	}
	
	 
//Le faltaban a varias llaves
	    
