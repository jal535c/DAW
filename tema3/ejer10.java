/**
*	
*	Ejercicio 10: Conversor de MB a KB
*
*/

public class ejer10 {
	public static void main(String[] args) {
		int megas;

		System.out.print("Cuantos MB? ");
		megas = Integer.parseInt(System.console().readLine());

		System.out.printf("Son %d KB\n", megas*1024);		
	}
}