/*
*
* Ejercicio 7: Calcula el total de una factura a partir de la base imponible
*
*/

public class ejer7 {
	public static void main(String[] args) {
		float baseImponible;
		float incremento;
		float total;
		final int iva = 21;

		System.out.print("Introduzca base imponible: ");
		baseImponible = Float.parseFloat(System.console().readLine());

		incremento = baseImponible*21/100;
		total = baseImponible + incremento;

		System.out.printf("El total de la factura es: %.2f euros\n", total);
	}
}