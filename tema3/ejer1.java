/*
*
* Ejercicio 1: Captura 2 numeros y realiza el producto
*
*/

public class ejer1 {
	public static void main(String[] args) {
		String num1, num2;
		int n1;
		int n2;

		System.out.print("Introduzca numero 1: ");
		num1 = System.console().readLine();
		n1 = Integer.parseInt(num1);
		
		System.out.print("Introduzca numero 2: ");
		//num2 = System.console().readLine();
		n2 = Integer.parseInt(System.console().readLine());
		
		System.out.printf("El producto es %d", n1*n2);		
	}
}