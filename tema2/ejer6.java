/*
*
* Ejercicio 6: Calculo de factura a partir de la base imponible
*
*/

public class ejer6 {
	public static void main(String[] args) {
		int iva = 21;
		float baseImponible = 200.00f;
		
		float incremento = baseImponible*21/100;
		float total = baseImponible + incremento;

		System.out.printf("El total es: %.2f euros\n", total);
	}
}