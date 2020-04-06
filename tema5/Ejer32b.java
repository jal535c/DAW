/*
*
* Ejercicio 32b: Muestra los pares y los suma, sin invertir el numero
*
*/

public class Ejer32b {
  public static void main(String[] args) {
    long n;
    //long reverso=0;
    int tam=0;
    int suma=0;
    int digito;

    int potencia;
    String salida="";

    System.out.print("Introduzca numero: ");
    n = Long.parseLong(System.console().readLine());

    Long aux = n;     //copia del valor de entrada

    while (n >0) {
      //reverso = (n%10) + (reverso*10);
      n /= 10;
      tam++;
    }

    System.out.println("Los digitos pares son:");

    potencia = (int)Math.pow(10,tam-1);
    
    for (int i=0; i<tam; i++) {
      digito = (int)(aux/potencia);
      digito = digito%10;
      
      if (digito%2==0) {
        salida = salida+digito;
        suma += digito;
      }

      potencia /= 10;
    }
    System.out.println(salida);
    System.out.printf("\nLa suma de los pares es: %d\n", suma);
  }
}