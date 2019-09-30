/*
*
* Ejercicio 17: Ultima cifra de un numero entero
*
*/

public class ejer17 {
	public static void main(String[] args) {
		int n, ultimo;

		System.out.print("Introduzca numero entero: ");
		n = Integer.parseInt(System.console().readLine());

		ultimo = n%10;
		
		System.out.println("La ultima cifra es: " + ultimo);
	}
}