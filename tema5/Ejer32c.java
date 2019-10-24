/*
*
* Ejercicio 32b: Muestra los pares y los suma, sin invertir el numero, y sin calcular tamaño
*
*/

public class Ejer32c {
  public static void main(String[] args) {
    long n;
    Long aux;   //copia del valor de entrada
    int suma=0;
    int digito;
    String salida="";

    System.out.print("Introduzca numero: ");
    n = Long.parseLong(System.console().readLine());

    aux = n;     
    
    System.out.println("Los digitos pares son:");

    while (aux>0) {
      digito = (int)(aux %10);

      if (digito%2 == 0) {
        salida = digito+salida;     //acumula en el string en el orden correcto
        suma += digito;
      }

      aux /= 10;
    }
    
    System.out.println(salida);
    System.out.printf("\nLa suma de los pares es: %d\n", suma);
  }
}