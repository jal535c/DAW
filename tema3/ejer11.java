/**
*	
*	Ejercicio 11: Conversor de KB a MB
*
*/

public class ejer11 {
	public static void main(String[] args) {
		int mem;

		System.out.print("Cuantos KB? ");
		mem = Integer.parseInt(System.console().readLine());

		System.out.printf("Son %d MB\n", mem/1024);		
	}
}