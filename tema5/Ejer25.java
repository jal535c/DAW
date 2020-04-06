/*
*
* Ejercicio 25: Reverso de un numero
*
*/

public class Ejer25 {
  public static void main(String[] args) {
    int n;
    int digit;
    int resul=0;

    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());
 
    while (n>0) {
      digit = n % 10;               //cojo el ultimo digito
      resul = (resul*10) + digit;   //acumulo con lo que tenia
      n = n/10;                     //actualiza numero (recorto)
    }

    System.out.println("Reverso: " + resul);
  }
}
