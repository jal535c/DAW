/*
*
* Ejercicio 4: Conversor de una cantidad de euros a pesetas
*
*/

public class ejer4 {
	public static void main(String[] args) {
		float euros = 1.00f;

		int resul = (int)(euros*166.386f);

		System.out.printf("%.2f euros son: %d ptas\n", euros, resul);
	}
}