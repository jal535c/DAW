/*
*
* Ejercicio 7: Mostrar char y String juntos
*
*/

public class ejer7 {
  	public static void main(String[] args) {
    	char c1='a', c2='b';
      	String s1="Uno", s2="Dos";
      
      	System.out.println(c1 + c2 + s1 + s2);		//muestra el codigo ascii del caracter
      	System.out.println(s1 + s2 + c1 + c2);		//ahora si concatena los caracteres al string
      	System.out.println("" + c1 + c2 + s1 + s2);	
    }
  } 
