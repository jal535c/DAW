/*
*
* Ejercicio 28: Calcula el factorial
*
*/

public class ejer28 {
	public static void main(String[] args) {
		int num, aux;
		int fact = 1;
		
		System.out.print("Introduzca un numero entero: ");
		num = Integer.parseInt(System.console().readLine());
		aux = num;

		while (num >= 1) {
			fact *= num;
			num--;
		}

		System.out.printf("%d! = %d\n", aux, fact);
	}
}