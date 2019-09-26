/*
*
* Ejercicio 8: Concatena variables char en un String
*
*/

public class ejer8 {
  	public static void main(String[] args) {
    	Character c1='a', c2='b',c3='c',c4='d',c5='e';
    	String s;
      
    	s = ""+c1+c2+c3+c4+c5;		//debo añadir un String para no tener error de tipos
    	System.out.println(s);		//ademas debe estar antes, sino muestra la suma de los codigos ascii
	}
} 
