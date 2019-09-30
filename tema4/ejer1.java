/*
*
* Ejercicio 1: Pedir un dia por teclado, devuelve la asignatura de primera hora ese dia
*
*/

public class ejer1 {
	public static void main(String[] args) {
		String dia, salida;

		System.out.print("Escriba un dia de la semana: ");
		dia = System.console().readLine();

		switch (dia) {
			case "lunes": 
				salida="EED"; 
				break;
			case "martes":
			case "miercoles": 
			case "jueves":
				salida = "PROG"; 
				break;
			case "viernes": 
				salida = "FOL"; 
				break;
			default: 
				salida = "Dia incorrecto"; 
		}

		System.out.printf("El %s a primera hora toca %s\n", dia, salida);
	}
}