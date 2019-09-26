/*
*
* Ejercicio 5: Conversor de una cantidad de pesetas a euros
*
*/

public class ejer5 {
	public static void main(String[] args) {
		int ptas = 1000;

		float euros = ptas/166.386f;

		System.out.printf("%d ptas son %.2f euros\n", ptas, euros);
	}
}